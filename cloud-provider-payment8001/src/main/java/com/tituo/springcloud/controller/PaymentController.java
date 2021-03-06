package com.tituo.springcloud.controller;

import com.tituo.springcloud.entities.CommonResult;
import com.tituo.springcloud.entities.Payment;
import com.tituo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author fuqm
 * @create 2020-06-11
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);

        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功,serverPort: "+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        Payment payment = paymentService.getPaymentById(id);

        if(payment != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  "+serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object SelectServer(){
        final List<String> services = discoveryClient.getServices();
        for (String element:services) {
            System.out.println("****全部服务信息:"+element);
        }

        //CLOUD-PAYMENT-SERVICE:获取这个微服务名下的所有服务的信息，这个名下的微服务有两个服务端
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        for (ServiceInstance instance:instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }

    /**
     *
     * 模拟超时
     * @return
     */
    @GetMapping("/get/payment/timeout")
    public String getTimeoutPort() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);

        return serverPort;
    }

    /**
     * Zipkin链路监控
     * @return
     */
    @GetMapping("/payment/zipkin")
    public String getZipKin(){

        return "hello,zipkin,hahahahahha";
    }

}
