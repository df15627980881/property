package com.example.demo.service;

import com.example.demo.entity.Activity;

import java.util.List;

/**
 * @Description: 活动Service
 * @author: df36643264
 * @date: 2021年03月18日 17:14
 */
public interface IActivityService {

    /**
     *@Description: 根据种类获取活动集合
     * @param type 种类(1为文化中心，2为全民健身）
     *@return: java.util.List<com.example.demo.entity.Activity>
     *@author: df36643264
     *@date: 2021-03-18 17:23
     **/

    public List<Activity> getList(int type);

    /**
     *@Description: 增加新的活动
     * @param type 种类(1为文化中心，2为全民健身）
     * @param activity 活动pojo
     *@return: boolean
     *@author: df36643264
     *@date: 2021-03-18 17:24
     **/

    public boolean add(int type, Activity activity);
}
