package com.mingqian.springcloud;

import com.mingqian.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们自定义的Ribbon配置类，从而使配置生效
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class MicroservicecloudConsumerDept80Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicecloudConsumerDept80Application.class, args);
	}

}
