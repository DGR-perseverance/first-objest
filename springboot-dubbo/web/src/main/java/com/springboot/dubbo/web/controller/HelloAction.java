package com.springboot.dubbo.web.controller;

import com.springboot.dubbo.pay.api.service.PayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAction {
    @Reference
    private PayService payService;

    @GetMapping("/sysHello")
    public String sysHello(String msg){
        try {
            return payService.sysHello(msg);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
