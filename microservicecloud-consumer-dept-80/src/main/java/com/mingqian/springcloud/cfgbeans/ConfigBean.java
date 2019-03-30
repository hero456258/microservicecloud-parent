package com.mingqian.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wanggang on 2019/3/24.
 */
@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //Spring Cloud  Ribbon是基于Netflix实现的一套客户端 负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
