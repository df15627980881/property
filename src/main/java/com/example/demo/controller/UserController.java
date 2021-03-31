package com.example.demo.controller;

import com.example.demo.common.CommonResult;
import com.example.demo.entity.User;
import com.example.demo.service.IRedisService;
import com.example.demo.service.IUserService;
import com.example.demo.service.impl.UserService;
import com.example.demo.util.JwtTokenUtil;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.HttpMethodConstraint;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@CrossOrigin
@RestController
public class UserController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IUserService userService;

    @Autowired
    private IRedisService redisService;

    @GetMapping("/hello")
    public String Hello() {
        return "hello";
    }

    @Value("${jwt.tokenHead}")
    private String tokenHead;

//    @ApiOperation(value = "根据username和password和role返回是否允许登录")
//    @PostMapping("/login")
//    public Boolean islogin(@RequestBody User user){
//        Boolean ok = userService.query(user);
//        if(ok) {
//            redisService.set(user.getUsername(), userService.query(userService.queryId(user)));
//            System.out.println("user: " + userService.query(userService.queryId(user)));
//        }
//        return ok;
//    }
    @ApiOperation(value = " 登录以后返回 token")
    @RequestMapping(value = "/login", method = POST)
    @ResponseBody
    public CommonResult login(@RequestBody User user, BindingResult result) {
        String token = userService.login(user.getUsername(), user.getPassword());
        LOGGER.info(user.getUsername() + " " + user.getPassword());
        System.out.println(token == null);
        if (token == null) {
            return CommonResult.validateFailed(" 用户名或密码错误 ");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation(value = "根据username获得信息")
//    @PostMapping("/getUserInfo/{username}")
    @RequestMapping(value = "/getUserInfo/{username}", method = POST)
    @ResponseBody
    public Map getInfo(@PathVariable("username") String username, HttpServletResponse response){
        System.out.println(username);
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control", "no-cache");
        return userService.getInfo(username);
    }

    @ApiOperation(value = "注册 返回1为成功,0为失败")
    @PostMapping("/register")
    public Integer register(@RequestBody User user){
        return userService.insert(user);
    }

    @ApiOperation(value = "修改头像图片")
    @PostMapping("/user/image/{id}/{imageName}")
    public Boolean updateImage(@PathVariable int id, @PathVariable String imageName, @RequestBody JSONObject data){
        String temp = data.getString("content");
        String imageData = temp.split(";")[1].split(",")[1];
        String filePath = new String("/Users/yuanxilan/Desktop/");
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        String imagePath = null;
        try {
            byte[] bytes = Base64.getDecoder().decode(imageData);
            imagePath = filePath + System.currentTimeMillis() + imageName;
            File file = new File(imagePath);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
            bos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(imagePath != null){
            return userService.changeImage(id, imagePath);
        }
        return false;
    }
}
