package com.example.demo.service;

import com.example.demo.entity.User;
import sun.misc.BASE64Encoder;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 用户Service
 * @author: df36643264
 * @date: 2021年03月18日 17:32
 */

public interface IUserService {

    int insert(User user);

    boolean delete(int id);

    boolean update(User user);

    User query(int id);

    int queryId(User user);

    Boolean query(User user);

    Map getInfo(String username);

    boolean changeImage(int id, String imagePath);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的 JWT 的 token
     */
    String login(String username, String password);
}
