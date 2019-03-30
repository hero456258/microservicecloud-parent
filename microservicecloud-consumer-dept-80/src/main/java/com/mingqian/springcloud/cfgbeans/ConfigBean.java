package com.mingqian.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

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

    @Bean
    public IRule randomRule(){
        //return new RetryRule();//先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用服务
        return new RandomRule();//默认是用的轮询，这里重新定义成随机的
    }
}
