package com.example.demo.dao;

import com.example.demo.entity.Announcement;

import java.util.List;

public interface IAnnouncementDao {

    /**
     *@Description: 获取公告列表
     * @param
     *@return: java.util.List<com.example.demo.entity.Announcement>
     *@author: df36643264
     *@date: 2021-03-18 17:29
     **/

    List<Announcement> getAnnouncements();

    /**
     *@Description: 插入新的通告
     * @param announcement 公告pojo
     *@return: boolean
     *@author: df36643264
     *@date: 2021-03-18 17:30
     **/

    boolean insert(Announcement announcement);
}
