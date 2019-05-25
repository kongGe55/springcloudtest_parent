package com.example.servicefeign.HiService;

import org.springframework.stereotype.Component;

/**
 * ClassName: SchedualServiceHiHystric
 * Description:
 * date: 2019/5/25 14:37
 *
 * @author ji
 * @version 1.0
 * @since JDK 1.8
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    @Override
    public String getHi() {
        return "sorry ";
    }

    @Override
    public String hi(String name) {
        return "sorry ,"+name;
    }
}
