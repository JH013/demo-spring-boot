package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName Home
 * @Author wangz
 * @Date 2020/6/14 0014 22:05
 * @Version 1.0
 */
@RestController
public class Home {

    @RequestMapping("/test1")
    public Map<String, Object> test1() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "test filter 1");
        System.out.println("Execute first method");
        return map;
    }

    @RequestMapping("/test2")
    public Map<String, Object> test2() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "test filter 2");
        System.out.println("Execute second method");
        return map;
    }
}
