package com.ssm.service.impl;

import com.ssm.mapper.EmployeeMapper;
import com.ssm.pojo.Employee;
import com.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @data 2020/9/18 21:52
 */
@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public int insert(Employee emp) {
        return employeeMapper.insert(emp);
    }

    @Override
    public Employee selectById(int id) {
        return employeeMapper.selectById(id);
    }
}
