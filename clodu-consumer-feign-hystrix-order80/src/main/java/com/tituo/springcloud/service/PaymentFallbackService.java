package com.tituo.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author fuqm
 * @create 2020-06-15
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    /**
     * 访问正常，ok
     *
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    /**
     * 访问超时
     *
     * @param id
     * @return
     */
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
