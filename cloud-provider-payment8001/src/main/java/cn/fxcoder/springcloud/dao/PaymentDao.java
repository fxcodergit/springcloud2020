package cn.fxcoder.springcloud.dao;


import cn.fxcoder.springcloud.entities.Payment;

public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(Integer id);

}
