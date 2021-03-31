package com.example.demo.dao;

import com.example.demo.entity.Activity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IActivityDao {

    /**
     *@Description: 根据种类获取活动集合
     * @param type 种类(1为文化中心，2为全民健身）
     *@return: java.util.List<com.example.demo.entity.Activity>
     *@author: df36643264
     *@date: 2021-03-18 17:23
     **/

    List<Activity> getList(int type);

    /**
     *@Description: 增加新的活动
     * @param type 种类(1为文化中心，2为全民健身）
     * @param activity 活动pojo
     *@return: boolean
     *@author: df36643264
     *@date: 2021-03-18 17:24
     **/
    boolean insert(@Param("type") int type, Activity activity);
}
