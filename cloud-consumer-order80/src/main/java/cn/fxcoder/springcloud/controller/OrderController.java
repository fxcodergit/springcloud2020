package cn.fxcoder.springcloud.controller;


import cn.fxcoder.springcloud.entities.CommonResult;
import cn.fxcoder.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    @ResponseBody
    public CommonResult create(@RequestBody Payment payment) {
        log.info("consumer 调用创建");
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    @ResponseBody
    public CommonResult getPayment(@PathVariable("id") Integer id) {
        log.info("consumer 调用查询");
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }


}
