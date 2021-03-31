package com.example.demo.controller;

import com.example.demo.dao.IGoodDao;
import com.example.demo.entity.Good;
import com.example.demo.service.IGoodService;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description:
 * @author: df36643264
 * @date: 2021年03月19日 22:17
 */

@CrossOrigin
@RestController
public class GoodController {

    @Autowired
    private IGoodService goodService;

    @ApiOperation(value = "获取商品列表")
    @GetMapping("/getGoodLists")
    public List<Good> getList() {
        return goodService.getList();
    }

    @ApiOperation(value = "添加商品")
    @PostMapping("/addGood")
    public Boolean addGood(@RequestBody Good good) {
        return goodService.addGood(good) > 0;
    }

    @ApiOperation(value = "购买商品")
    @PostMapping("/buyGood/{id}/{num}")
    public Boolean buyGood(@PathVariable Integer id, @PathVariable Integer num) {
        return goodService.buyGood(id, num) > 0;
    }
}
