package com.mingqian.springcloud.controller.deptConsumer;

import com.mingqian.springcloud.entity.Dept;
import com.mingqian.springcloud.service.deptClient.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.deptClientService.get(id);
    }

    @RequestMapping(value = "/dept/list")
    public List<Dept> list()
    {
        return this.deptClientService.list();
    }

    @RequestMapping(value = "/dept/add")
    public Object add(Dept dept)
    {
        return this.deptClientService.add(dept);
    }
}
