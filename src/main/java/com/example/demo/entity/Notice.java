package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Notice {

    @ApiModelProperty(value = "编号", example = "0")
    private int id;
    @ApiModelProperty(value = "标题", example = "10至11月水电费缴费通知")
    private String title;
    @ApiModelProperty(value = "内容")
    private String desc;
    @ApiModelProperty(value = "日期", example = "2020-12-11")
    private Date date;

    public Notice() {
    }

    public Notice(int id, String title, String desc, Date date) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
