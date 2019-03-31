package com.mingqian.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by wanggang on 2019/3/24.
 */
/*//有参构造
@AllArgsConstructor
//无参构造
@NoArgsConstructor
//setter和getter
@Data
//链式访问
@Accessors(chain = true)
//必须序列化*/
public class Dept implements Serializable{

    /**部门编号*/
    private Long deptno;

    /**部门名称*/
    private String dname;

    /**来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库*/
    private String dbSource;

    public Dept() {
    }

    public Dept(Long deptno, String dname, String dbSource) {
        this.deptno = deptno;
        this.dname = dname;
        this.dbSource = dbSource;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDbSource() {
        return dbSource;
    }

    public void setDbSource(String dbSource) {
        this.dbSource = dbSource;
    }
}
