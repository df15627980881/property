package com.example.demo;

import com.example.demo.dao.IGoodDao;
import com.example.demo.entity.Good;
import com.example.demo.service.IGoodService;
import com.example.demo.service.IRedisService;
import com.example.demo.service.impl.RedisServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private IRedisService redisService;

    @Autowired
    private IGoodService goodService;

    @Autowired
    private IGoodDao goodDao;

    @Test
    void contextLoads() {
        goodService.buyGood(1,99);
    }

}
