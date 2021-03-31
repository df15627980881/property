package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;

public class User {

    @ApiModelProperty(value = "编号", example = "1")
    private Integer id;
    @ApiModelProperty(value = "登录账号", example = "admin")
    private String username;
    @ApiModelProperty(value = "密码", example = "123456")
    private String password;
    @ApiModelProperty(value = "角色(1是物业， 2是业主)", example = "1")
    private Integer role;//1是物业， 2是业主
    @ApiModelProperty(value = "头像路径", example = "/Users/yuanxilan/Desktop/1.jpg")
    private String imagePath;
    @ApiModelProperty(value = "手机号", example = "15627980881")
    private String phoneNumber;

    public User() {
    }

    public User(Integer id, String username, String password, Integer role, String imagePath, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.imagePath = imagePath;
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", imagePath='" + imagePath + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
