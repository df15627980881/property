package com.example.demo.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @author: df36643264
 * @date: 2021年03月31日 4:11 下午
 */

@Data
public class UploadProperties implements Serializable {

    private String baseUrl;
    private List<String> allowTypes;
    private String upYunUrl;
    private String upYunFilePath;
    private String upYunBucketName;
    private String upYunUserName;
    private String upYunPassword;
    private Integer upYunOutTime;
}
