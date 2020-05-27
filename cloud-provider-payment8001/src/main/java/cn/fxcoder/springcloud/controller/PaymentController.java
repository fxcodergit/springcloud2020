package cn.fxcoder.springcloud.controller;


import cn.fxcoder.springcloud.entities.CommonResult;
import cn.fxcoder.springcloud.entities.Payment;
import cn.fxcoder.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    @ResponseBody
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("**** 插入结果：" + result);
        if (result > 0) {
            return new CommonResult<>(200, "创建测试", result);
        }
        return null;
    }

    @GetMapping("/payment/get/{id}")
    @ResponseBody
    public CommonResult getPaymentById(@PathVariable("id") Integer id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("**** 查询结果：" + result);
        if (result != null) {
            return new CommonResult<>(200, "查询测试", result);
        }else{
            return new CommonResult<>(404, "没有数据", result);
        }
    }
}


