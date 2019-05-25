package com.example.servicefeign.HiService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName: SchedualServiceHi
 * Description:
 * date: 2019/5/25 14:05
 *
 * @author ji
 * @version 1.0
 * @since JDK 1.8
 */
@FeignClient(value = "SERVICEHI",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
    @RequestMapping("/hello")
    public String getHi();
    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name);
}
