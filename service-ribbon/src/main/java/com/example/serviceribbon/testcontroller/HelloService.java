package com.example.serviceribbon.testcontroller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: HelloController
 * Description:
 * date: 2019/5/25 11:02
 *
 * @author ji
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;
    public String test(){
        String s = restTemplate.getForObject("http://SERVICEHI/hello", String.class);
        return s;
    }
    @HystrixCommand(fallbackMethod = "error")
    public String hi(String name){
        String s = restTemplate.getForObject("http://SERVICEHI/hi?name="+name, String.class);
        return s;
    }
    public String error(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
