package com.mingqian.springcloud.service.dept;

import com.mingqian.springcloud.entity.Dept;

import java.util.List;

/**
 * Created by wanggang on 2019/3/24.
 */
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
