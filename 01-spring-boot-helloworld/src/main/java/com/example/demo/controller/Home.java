package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName Home
 * @Author wangz
 * @Date 2020/6/14 0014 19:08
 * @Version 1.0
 */
@RestController
public class Home {
    @RequestMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "hello world!!!");
        return map;
    }
}
