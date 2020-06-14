package com.tituo.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author fuqm
 * @create 2020-06-12
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * 远程调用使用resttemplate
     * @return
     */
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
