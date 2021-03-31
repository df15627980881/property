package com.example.demo.service;

import com.example.demo.entity.Good;

import java.util.List;

/**
 * @Description: 商品类服务层
 * @author: df36643264
 * @date: 2021年03月19日 22:04
 */
public interface IGoodService {

    int addGood(Good good);

    List<Good> getList();

    int buyGood(Integer id, Integer num);

    int checkState(Integer id);

}
