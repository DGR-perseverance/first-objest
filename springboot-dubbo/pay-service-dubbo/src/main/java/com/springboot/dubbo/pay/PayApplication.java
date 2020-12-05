package com.ryx.fund.pay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaodw
 * @version V1.0
 * @Package com.ryx.pay.pre
 * @Description: TODO
 * @date 2020/9/22 14:19
 */
@SpringBootApplication
@MapperScan("com.ryx.fund.pay.mapper")
public class PayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class, args);
    }

}

