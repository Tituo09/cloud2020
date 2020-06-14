package com.tituo.springcloud.dao;

import com.tituo.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author fuqm
 * @create 2020-06-11
 */
@Mapper
public interface PaymentDao {

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
