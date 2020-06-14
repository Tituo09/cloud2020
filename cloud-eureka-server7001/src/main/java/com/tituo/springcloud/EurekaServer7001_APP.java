package com.tituo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author fuqm
 * @create 2020-06-12
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_APP.class, args);
    }
}
