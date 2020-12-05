package com.springboot.dubbo.pay.api.model;

import java.io.Serializable;

public class PayModel implements Serializable {
    private static final long serialVersionUID = 6281919877551242245L;
    /**
     * 商户id
     */
    private String merchantId;
    /**
     * 支付方式
     */
    private String payType;
}
