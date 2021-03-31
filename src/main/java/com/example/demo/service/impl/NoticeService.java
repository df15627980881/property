package com.example.demo.service.impl;

import com.example.demo.dao.INoticeDao;
import com.example.demo.entity.Notice;
import com.example.demo.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService implements INoticeService {

    @Autowired
    private INoticeDao noticeDao;

    public List<Notice> getNoticeList(int id){
        return noticeDao.getListById(id);
    }
}
