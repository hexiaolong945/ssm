package com.ssm.mapper;

import com.ssm.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @data 2020/9/18 21:22
 */
public interface EmployeeMapper {

    /**
     * 插入一条员工信息
     * @param emp 员工信息
     * @return
     */
    @Insert("insert into employee(name,age,sex,address,phone,password) values(#{name},#{age},#{sex},#{address},#{phone},#{password})")
    public int insert(Employee emp);

    /**
     * 根据id查找员工信息
     * @param id
     * @return
     */
    @Select("select * from employee where id = #{id}")
    public Employee selectById(int id);

    /**
     * 查询employee表中的员工信息
     * @return
     */
    @Select("select * from employee")
    public List<Employee> selectAll();

    /**
     * 修改员工信息
     * @param employee
     * @return
     */
    @Update("update employee set name=#{name},age=#{age},sex=#{sex},address=#{address},phone=#{phone} where id=#{id}")
    public int EmployeeEdit(Employee employee);


    /**
     * 根据id删除一条员工信息
     * @param id 员工id
     * @return
     */
    @Delete("delete from employee where id = #{id}")
    public int deleteById(int id);

}
