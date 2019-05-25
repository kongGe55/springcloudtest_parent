package com.example.service_hi.service.impl;

import com.example.service_hi.service.TestService;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

/**
 * ClassName: TestServiceImpl
 * Description:
 * date: 2019/5/25 10:56
 *
 * @author ji
 * @version 1.0
 * @since JDK 1.8
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "服务调用成功";
    }
}
