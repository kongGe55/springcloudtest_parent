package com.example.service_hi.controller;

import com.example.service_hi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HiController
 * Description:
 * date: 2019/5/25 10:54
 *
 * @author ji
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
public class HiController {
    @Autowired
    private TestService testService;
    @RequestMapping("/hello")
    public String hello(){
        return testService.test();
    }
    @RequestMapping("/hi")
    public String hi(String name){
        return "你好啊,"+name;
    }
}
