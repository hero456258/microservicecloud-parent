package com.mingqian.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义配置类：
 *      注意事项：
 *              自定义的配置类不能和主启动类同包以及子包
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new Random_ZY();//自定义为每台调用五次
    }
}
