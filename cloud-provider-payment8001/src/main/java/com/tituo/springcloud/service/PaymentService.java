package com.tituo.springcloud.service;

import com.tituo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;


/**
 * @author Tituo
 */
public interface PaymentService
{
    /**
     * 新增
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 查询
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}