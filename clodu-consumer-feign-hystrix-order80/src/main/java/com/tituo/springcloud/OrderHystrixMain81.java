package com.tituo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author fuqm
 * @create 2020-06-15
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain81 {
    public static void main(String[] args) {
            SpringApplication.run(OrderHystrixMain81.class, args);
        }
}
