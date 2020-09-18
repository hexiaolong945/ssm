package com.ssm.service;

import com.ssm.pojo.Employee;

/**
 * @data 2020/9/18 21:28
 */
public interface EmployeeService {

    /**
     * 插入一条员工信息
     * @param emp 员工信息
     * @return
     */
    public int insert(Employee emp);

    /**
     * 根据id查找员工信息
     * @param id
     * @return
     */
    public Employee selectById(int id);
}
