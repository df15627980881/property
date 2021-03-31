package com.example.demo.entity;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 商品
 * @author: df36643264
 * @date: 2021年03月19日 21:47
 */
@Setter
@Getter
@ToString
public class Good {


    private Integer id;
    private String name;//商品名字
    private Integer stock;//库存
    private Integer aslesVolume;//销售量
    private Double price;//价格
    private String imgUrl;//图片路径
    private String description;//商品描述
    private Byte state;//状态 0表示错误，1表示正常售卖，2表示已下架

    public Good() {

    }

    public Good(Integer id, String name, Integer stock, Integer aslesVolume, Double price, String imgUrl, String description, Byte state) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.aslesVolume = aslesVolume;
        this.price = price;
        this.imgUrl = imgUrl;
        this.description = description;
        this.state = state;
    }
}
