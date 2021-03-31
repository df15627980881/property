package com.example.demo.service;

import com.example.demo.entity.Notice;

import java.util.List;

/**
 * @Description: 支付Service
 * @author: df36643264
 * @date: 2021年03月18日 17:36
 */
public interface INoticeService {

    List<Notice> getNoticeList(int id);
}
