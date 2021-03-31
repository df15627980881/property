package com.example.demo.service.impl;

import com.example.demo.dao.IAnnouncementDao;
import com.example.demo.entity.Announcement;
import com.example.demo.service.IAnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService implements IAnnouncementService {
    @Autowired
    private IAnnouncementDao announcementDao;

    public List<Announcement> getList(){
        return announcementDao.getAnnouncements();
    }

    public boolean insert(Announcement announcement){
        return announcementDao.insert(announcement);
    }
}
