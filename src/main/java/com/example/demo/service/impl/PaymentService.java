package com.example.demo.service.impl;

import com.example.demo.dao.IPaymentDao;
import com.example.demo.entity.PaymentRecord;
import com.example.demo.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentService{
    @Autowired
    private IPaymentDao paymentDao;

    public List<PaymentRecord> queryBillsByUserID(int id){
        return paymentDao.queryBills(id);
    }
}
