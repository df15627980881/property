package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class RepairRecord {

    @ApiModelProperty(value = "编号", example = "0")
    private int id;
    @ApiModelProperty(value = "日期", example = "2020-01-01")
    private Date date;
    @ApiModelProperty(value = "姓名", example = "杨浩")
    private String contactPerson;
    @ApiModelProperty(value = "手机号", example = "15627980881")
    private String phoneNumber;
    @ApiModelProperty(value = "状态(完成1，未完成2)", example = "1")
    private Integer status;//完成1，未完成2
    @ApiModelProperty(value = "故障详情")
    private String details;
    @ApiModelProperty(value = "地址", example = "B栋")
    private String address;

    public RepairRecord() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
