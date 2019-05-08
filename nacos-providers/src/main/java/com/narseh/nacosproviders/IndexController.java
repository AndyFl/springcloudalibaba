package com.narseh.nacosproviders;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: luzw
 * @Date: 2019/1/30 15:46
 */

@RestController
@RequestMapping("/show")
public class IndexController {

    @GetMapping("index")
    public String index(){
         return "hello world";
    }

    @GetMapping("/showdata")
    public String showData(@RequestParam Integer a, @RequestParam Integer b) {
     return "展示数据相除"+ a/b;
    }
}
