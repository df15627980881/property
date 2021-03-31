package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import java.util.Date;

public class PaymentRecord {

    @ApiModelProperty(value = "编号", example = "0")
    private int id;
    @ApiModelProperty(value = "用户编号", example = "0")
    private int user_id;
    @ApiModelProperty(value = "日期", example = "2020-01-01")
    private Date date;
    @ApiModelProperty(value = "费用(正数为余额，负数为欠费)", example = "100")
    private int price;
    @ApiParam(value = "1为天然气，2为物业，3为水费，4为宽带费，5为电费")
    private int type;

    public PaymentRecord() {
    }

    public PaymentRecord(int id, int user_id, Date date, int price, int type) {
        this.id = id;
        this.user_id = user_id;
        this.date = date;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
