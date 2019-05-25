package com.example.serviceribbon.controller;

import com.example.serviceribbon.testcontroller.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestController
 * Description:
 * date: 2019/5/25 11:13
 *
 * @author ji
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
public class TestController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/test")
    public String tets(){
        return helloService.test();
    }
    @RequestMapping("/hi")
    public String hi(String name){
        return helloService.hi(name);
    }
}
