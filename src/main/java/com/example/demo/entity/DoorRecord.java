package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class DoorRecord {

    @ApiModelProperty(value = "日期", example = "2020-05-11")
    private Date date;
    @ApiModelProperty(value = "姓名", example = "陈建邦")
    private String name;
    @ApiModelProperty(value = "性别", example = "男")
    private String sex;
    @ApiModelProperty(value = "手机号", example = "15627980881")
    private String num;
    @ApiModelProperty(value = "身份证", example = "441581199704040034")
    private String idCard;

    public DoorRecord() {
    }

    public DoorRecord(Date date, String name, String sex, String num, String idCard) {
        this.date = date;
        this.name = name;
        this.sex = sex;
        this.num = num;
        this.idCard = idCard;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
}
