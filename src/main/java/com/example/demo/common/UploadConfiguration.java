package com.example.demo.common;

import com.UpYun;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: df36643264
 * @date: 2021年03月31日 4:14 下午
 */

@Configuration
public class UploadConfiguration {

    @Bean
    @ConfigurationProperties(prefix="up")
    public UploadProperties uploadProperties() {return new UploadProperties();}

//    @Bean
//    public UpYun upYun(UploadProperties uploadProperties) {
//        return new UpYun(uploadProperties.getUpYunBucketName(), uploadProperties.getUpYunUserName(), uploadProperties.getUpYunPassword());
//    }
}
