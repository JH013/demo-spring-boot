package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description TODO
 * @ClassName Home
 * @Author wangz
 * @Date 2020/6/17 0017 21:39
 * @Version 1.0
 */
@Controller
public class Home {
    @RequestMapping("/index")
    public String helloHtml(){
        return "index";
    }
}
