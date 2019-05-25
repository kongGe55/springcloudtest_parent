package com.example.servicefeign.controller;

import com.example.servicefeign.HiService.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: TestControler
 * Description:
 * date: 2019/5/25 14:07
 *
 * @author ji
 * @version 1.0
 * @since JDK 1.8
 */
@RestController
public class TestControler {
    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @RequestMapping("/test")
    public String test(){
        return schedualServiceHi.getHi();
    }
    @RequestMapping("/hi")
    public String test(String name){
        return schedualServiceHi.hi(name);
    }
}
