package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Announcement {

    @ApiModelProperty(value="编号", example = "0")
    private int id;
    @ApiModelProperty(value="日期")
    private Date date;
    @ApiModelProperty(value="标题", example = "2020-11-05")
    private String title;
    @ApiModelProperty(value="内容")
    private String ano;

    public Announcement() {
    }

    public Announcement(int id, Date date, String title, String ano) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.ano = ano;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
