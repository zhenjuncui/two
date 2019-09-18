package com.leyou.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "user")//会自动读取application.yml或properties配置文件
public class User {
    private int id;
    private String username;
    private int age;

    private List<String> girlFridends;
}
