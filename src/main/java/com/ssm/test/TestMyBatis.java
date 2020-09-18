package com.ssm.test;

import com.alibaba.druid.support.json.JSONUtils;
import com.ssm.pojo.Employee;
import com.ssm.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;

/**
 * @data 2020/9/18 21:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger("TestMyBatis.class");
    private ApplicationContext application = null;

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void test1(){
        Employee employee = new Employee("张三", 18, 1, "广州天河", "13612345678", "123");
        int result = employeeService.insert(employee);
        logger.info(JSONUtils.toJSONString(result));
    }
}
