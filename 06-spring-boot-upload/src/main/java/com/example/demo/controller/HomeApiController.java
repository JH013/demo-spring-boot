package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @ClassName FileUploadController
 * @Author wangz
 * @Date 2020/6/17 0017 23:34
 * @Version 1.0
 */
@RestController
public class HomeApiController {
    @RequestMapping("/fileUpload")
    public Map<String, Object> fileUpload(MultipartFile filename) throws IOException {
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("e:/" + filename.getOriginalFilename()));
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "success");
        return map;
    }
}
