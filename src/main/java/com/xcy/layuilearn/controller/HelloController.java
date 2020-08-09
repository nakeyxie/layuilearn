package com.xcy.layuilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author xcy
 * @Date 2020/8/9 14:50
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello-xcy";
    }
}
