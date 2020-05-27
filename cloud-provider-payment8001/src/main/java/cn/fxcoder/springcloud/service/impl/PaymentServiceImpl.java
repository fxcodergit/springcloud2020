package cn.fxcoder.springcloud.service.impl;

import cn.fxcoder.springcloud.dao.PaymentDao;
import cn.fxcoder.springcloud.entities.Payment;
import cn.fxcoder.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PaymentServiceImpl implements PaymentService{

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentDao.getPaymentById(id);
    }
}
