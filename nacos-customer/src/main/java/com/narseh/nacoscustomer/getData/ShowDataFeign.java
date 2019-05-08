package com.narseh.nacoscustomer.getData;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: luzw
 * @Date: 2019/2/14 17:25
 */
@FeignClient(name = "service-providers",path = "/show", fallback = ShowDataFallBackServices.class,configuration = FallBackConfig.class)
public interface ShowDataFeign {
    @GetMapping("/showdata")
    public String getData(@RequestParam  Integer a, @RequestParam Integer b);
}
