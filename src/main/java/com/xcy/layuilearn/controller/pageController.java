package com.xcy.layuilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName pageController
 * @Description 页面视图解析器
 * @Author xcy
 * @Date 2020/8/9 15:39
 */
@Controller
public class pageController {

    @GetMapping("/{url}")
    public String redirect(@PathVariable("url") String url) {
        return url;
    }
}
