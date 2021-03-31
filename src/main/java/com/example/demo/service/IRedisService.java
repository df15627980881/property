package com.example.demo.service;

import java.util.List;

/**
 * @Description: redis操作Service
 * @author: df36643264
 * @date: 2021年03月18日 16:59
 */

public interface IRedisService {

    /**
     * 存储数据
     */
    void set(String key, Object value);

    /**
     * 获取数据
     */
    String get(String key);

    <T> T get(String key, Class<T> clazz);

    List<String> getList(String key);

    List<String> getListByRange(String key, long l, long r);

    /**
     * 删除数据
     */
    void delete(String key);

    /**
     * 自增操作
     * @param delta 自增步长
     */
    Long increment(String key, long delta);
}
