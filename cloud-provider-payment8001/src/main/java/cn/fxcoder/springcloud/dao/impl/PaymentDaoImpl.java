package cn.fxcoder.springcloud.dao.impl;

import cn.fxcoder.springcloud.dao.PaymentDao;
import cn.fxcoder.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
public class PaymentDaoImpl implements PaymentDao{

    // 数据缓存
    private static volatile ConcurrentHashMap<Long,Payment> cacheMap = new ConcurrentHashMap<>();

    @Override
    public int create(Payment payment) {
        return 0;
    }

    @Override
    public Payment getPaymentById(Integer id) {
        Payment payment = new Payment();
        payment.setId(12L);
        payment.setSerial("hahahah");
        return payment;
    }
}
