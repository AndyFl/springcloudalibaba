package com.narseh.nacosconfigs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NacosConfigsApplication {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));
        SpringApplication.run(NacosConfigsApplication.class, args);
    }

}
