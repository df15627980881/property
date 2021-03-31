package com.example.demo.service;

import com.example.demo.entity.PaymentRecord;

import java.util.List;

/**
 * @Description: 支付Service
 * @author: df36643264
 * @date: 2021年03月18日 17:35
 */
public interface IPaymentService {

    List<PaymentRecord> queryBillsByUserID(int id);
}
