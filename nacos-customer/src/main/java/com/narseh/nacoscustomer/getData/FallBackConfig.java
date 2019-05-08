package com.narseh.nacoscustomer.getData;

import org.springframework.context.annotation.Bean;

/**
 * @author: luzw
 * @Date: 2019/2/14 17:33
 */

public class FallBackConfig {
    @Bean
    public ShowDataFallBackServices showDataFallBackServices(){
        return  new ShowDataFallBackServices();
    }
}
