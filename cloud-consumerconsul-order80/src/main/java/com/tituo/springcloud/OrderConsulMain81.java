package com.tituo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author fuqm
 * @create 2020-06-14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain81.class, args);
    }
}
