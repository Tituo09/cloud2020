package com.tituo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author fuqm
 * @create 2020-06-15
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeignMain81 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignMain81.class, args);
    }
}
