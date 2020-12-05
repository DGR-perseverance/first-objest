package com.springboot.dubbo.pay.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.springboot.dubbo.pay.api.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.common.utils.StringUtils;
import org.apache.dubbo.config.annotation.Service;

@Slf4j
@Service(interfaceClass = PayService.class)
public class PayServiceImpl implements PayService {
    @Override
    public String sysHello(String msg) throws Exception {
        log.info("请求参数：{}", msg);
        //1、判断请求参数是否为空
        if(StringUtils.isEmpty(msg)){
            throw new Exception("请求参数为空");
        }
        //2、业务处理
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", "1");
        jsonObject.put("name", "小明");
        jsonObject.put("age", 19);
        //3、响应结果
        return jsonObject.toJSONString();
    }
}
