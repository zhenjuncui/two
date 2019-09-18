package com.leyou.controller;

import com.leyou.pojo.User;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private User user;

    @GetMapping("/user/hello")
    public String hello() {
        log.debug("获取到的用户名是："+user.getUsername());

//        System.out.println(user.getUsername());
        return "hello spring boot"+user.getUsername();
    }
    @GetMapping("/user/hello1")
    public String hello1() {
       log.info("hello1获取到的用户名是："+user.getUsername());

//        System.out.println(user.getUsername());
        return "hello spring boot"+user.getUsername();
    }
}
