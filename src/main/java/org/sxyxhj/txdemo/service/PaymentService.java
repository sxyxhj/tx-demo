package org.sxyxhj.txdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.sxyxhj.txdemo.mybatis.mapper.test1.AlipayMapper;
import org.sxyxhj.txdemo.mybatis.mapper.test2.PaymentMapper;

/**
 * @program: tx-demo
 * @description: 支付服务
 * @author: elroyh
 * @create: 2021-03-04 15:47
 **/

@Service
public class PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;
    @Autowired
    private AlipayMapper alipayMapper;


    public void updateCost(int id, int money){
        paymentMapper.updateCost(id,money);
       // int i=1/0;
        alipayMapper.updateCost(id,money);

    }
}
