package com.example.demo.dao;

import com.example.demo.entity.PaymentRecord;

import java.util.List;

public interface IPaymentDao {

    public List<PaymentRecord> queryBills(int user_id);

}
