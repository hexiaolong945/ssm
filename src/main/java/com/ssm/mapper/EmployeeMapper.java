package com.ssm.mapper;

import com.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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
}
