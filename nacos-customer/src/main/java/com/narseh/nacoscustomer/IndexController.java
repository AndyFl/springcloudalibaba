package com.narseh.nacoscustomer;

import com.narseh.nacoscustomer.getData.ShowDataFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: luzw
 * @Date: 2019/2/14 17:00
 */

@RestController
public class IndexController {

    @Autowired
    private ShowDataFeign showDataFeign;

    @GetMapping(value = "/showData")
    public String showData(@RequestParam Integer a, @RequestParam Integer b){
        return  showDataFeign.getData(a, b);
    }

}
