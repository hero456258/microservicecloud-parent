package com.mingqian.springcloud.service;

import com.mingqian.springcloud.entity.Dept;
import com.mingqian.springcloud.service.deptClient.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by wanggang on 2019/3/31.
 */
@Component  //不要忘记加该注解
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
                dept.setDbSource("no this database in MySQL");
                return dept;
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
