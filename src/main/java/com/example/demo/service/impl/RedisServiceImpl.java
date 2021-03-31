package com.example.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Description: redis操作Service的实现类
 * @author: df36643264
 * @date: 2021年03月18日 17:02
 */

@Service
public class RedisServiceImpl implements IRedisService {

    private static final long WEEK_SECONDS = 60 * 60 * 24 * 7;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void set(String key, Object value) {
        stringRedisTemplate.opsForValue().set(key, JSON.toJSONString(value), WEEK_SECONDS, TimeUnit.SECONDS);
    }

    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public <T> T get(String key, Class<T> clazz) {
        String value = stringRedisTemplate.opsForValue().get(key);
        if(value == null) {
            try {
                Method method = clazz.getMethod("valueOf", new Class[]{String.class});
                return (T) method.invoke(null, new Object[]{"0"});
            } catch (NoSuchMethodException e) {
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e) {
                e.printStackTrace();
                return null;
            }
        }
        return JSON.parseObject(value, clazz);
    }

    @Override
    public List<String> getList(String key) {
        return stringRedisTemplate.opsForList().range(key, 0, -1);
    }

    @Override
    public List<String> getListByRange(String key, long l, long r) {
        return stringRedisTemplate.opsForList().range(key, l, r);
    }

    @Override
    public void delete(String key) {
        stringRedisTemplate.delete(key);
    }

    @Override
    public Long increment(String key, long delta) {
        return stringRedisTemplate.opsForValue().increment(key, delta);
    }
}
