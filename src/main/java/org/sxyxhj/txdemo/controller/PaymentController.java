package org.sxyxhj.txdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sxyxhj.txdemo.service.PaymentService;

/**
 * @program: tx-demo
 * @description: 支付接口
 * @author: elroyh
 * @create: 2021-03-04 15:53
 **/

@RestController
@Api(tags = "demo")
public class PaymentController {

    @Autowired
    PaymentService service;

    @GetMapping(path = "/payment")
    @ApiOperation(value = "test", httpMethod = "GET")
    public String updateCost(@Param("id") int id, @Param("money")int money){
        service.updateCost(id,money);
        return "test";
    }

}
