package com.ssm.service;

import com.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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

    /**
     * 查询employee表中的员工信息
     * @return
     */
    public List<Employee> selectAll();

    /**
     * 修改员工信息
     * @param employee
     * @return
     */
    public int EmployeeEdit(Employee employee);

    /**
     * 根据id删除一条员工信息
     * @param id 员工id
     * @return
     */
    public int deleteById(int id);
}
