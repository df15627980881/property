package com.example.demo.dao;

import com.example.demo.entity.Good;

import java.util.List;

/**
 * @Description: 商品接口DAO
 * @author: df36643264
 * @date: 2021年03月19日 21:47
 */
public interface IGoodDao {

    int addGood(Good good);

    List<Good> getList();

    int buyGood(Integer id, Integer num);

    int checkState(Integer id);
}
