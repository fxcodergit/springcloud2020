package cn.fxcoder.springcloud.service;

import cn.fxcoder.springcloud.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Integer id);


}
