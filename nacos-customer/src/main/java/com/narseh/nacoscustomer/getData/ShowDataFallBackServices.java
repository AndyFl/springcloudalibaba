package com.narseh.nacoscustomer.getData;

/**
 * @author: luzw
 * @Date: 2019/2/14 17:29
 */

public class ShowDataFallBackServices implements ShowDataFeign {
    @Override
    public String getData(Integer a, Integer b) {
        return "断路器打开，请求失败返回自定义错误信息"+a+"||||"+b;
    }
}
