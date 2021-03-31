package com.example.demo.entity;


import io.swagger.annotations.ApiModelProperty;

public class Activity {

    @ApiModelProperty(value = "用户编号", example = "0")
    private int id;
    @ApiModelProperty(value = "标题", example = "广州购书中心")
    private String title;
    @ApiModelProperty(value = "地址", example = "广州市天河路")
    private String address;
    @ApiModelProperty(value = "具体地址", example = "中国广东省广州市天河路123号")
    private String location;
    @ApiModelProperty(value = "工作时间", example = "10:00-21:30")
    private String businessHours;
    @ApiModelProperty(value = "容纳人数", example = "500")
    private String peopleNumber;
    @ApiModelProperty(value = "注意事项", example = "")
    private String attention;
    @ApiModelProperty(value = "图片")
    private String image;
    @ApiModelProperty(value = "图片路径", example = "/Users/yuanxilan/Desktop/dog1.jpg")
    private String imagePath;

    public Activity() {
    }

    public Activity(int id, String title, String address, String location, String businessHours, String peopleNumber, String attention, String image, String imagePath) {
        this.id = id;
        this.title = title;
        this.address = address;
        this.location = location;
        this.businessHours = businessHours;
        this.peopleNumber = peopleNumber;
        this.attention = attention;
        this.image = image;
        this.imagePath = imagePath;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBusinessHours() {
        return businessHours;
    }

    public void setBusinessHours(String businessHours) {
        this.businessHours = businessHours;
    }

    public String getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(String peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
