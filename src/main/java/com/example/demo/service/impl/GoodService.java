package com.example.demo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.dao.IGoodDao;
import com.example.demo.entity.Good;
import com.example.demo.service.IGoodService;
import com.example.demo.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: df36643264
 * @date: 2021年03月19日 22:04
 */

@Service
public class GoodService implements IGoodService {

    @Autowired
    private IGoodDao goodDao;

    @Autowired
    private IRedisService redisService;

    @Override
    public int addGood(Good good) {
        return goodDao.addGood(good);
    }

    @Override
    public List<Good> getList() {
        if(redisService.get("goodList") == null) {
            redisService.set("goodList", goodDao.getList());
        }
        return JSONObject.parseArray(redisService.get("goodList"), Good.class);
    }

    @Override
    public int buyGood(Integer id, Integer num) {
        int num1 = goodDao.buyGood(id, num);
        int num2 = goodDao.checkState(id);
        if(num2 > 0) {
            redisService.delete("goodList");
            redisService.set("goodList", goodDao.getList());
        }
        return num1;
    }

    @Override
    public int checkState(Integer id) {
        return goodDao.checkState(id);
    }
}
