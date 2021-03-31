package com.example.demo.common;

/**
 * @Description:封装 API 的错误码
 * @author: df36643264
 * @date: 2021年03月30日 6:55 下午
 */

public interface IErrorCode {
    long getCode();

    String getMessage();
}