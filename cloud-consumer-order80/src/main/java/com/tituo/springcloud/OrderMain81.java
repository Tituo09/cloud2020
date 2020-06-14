package com.tituo.springcloud;

import com.tituo.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author fuqm
 * @create 2020-06-11
 */
@SpringBootApplication
@EnableEurekaClient
//name:要访问的服务 configuration ：不在用默认的轮询，使用我自定义类里面的算法
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain81 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain81.class, args);
    }
}
