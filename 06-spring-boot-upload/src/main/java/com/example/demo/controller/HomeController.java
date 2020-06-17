package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description TODO
 * @ClassName Home
 * @Author wangz
 * @Date 2020/6/17 0017 23:38
 * @Version 1.0
 */
@Controller
public class HomeController {
    @RequestMapping("/upload")
    public String uploadHtml(){
        return "upload";
    }
}
