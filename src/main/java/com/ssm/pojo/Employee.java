package com.ssm.pojo;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * @data 2020/9/18 21:23
 * 员工表
 */
public class Employee {

    /**
     * 员工id
     */
    private Integer id;
    /**
     * 员工姓名
     */
    @Pattern(regexp = "^[\u4e00-\u9fa5]{2,20}$",message = "员工姓名必须要在2到20个字符之间，且必须为中文")
    private String name;
    /**
     * 年龄
     */
    @Range(min = 18,max = 80,message = "员工年龄要在18到80之间")
    private Integer age;
    /**
     * 性别：0为女，1为男
     */
    private Integer sex;
    /**
     * 地址
     */
    @Pattern(regexp = "^[\\u4e00-\\u9fa5]{2,20}$",message = "地址必须为中文")
    private String address;
    /**
     * 电话号码
     */
    @Pattern(regexp = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$",message = "电话号码格式不正确")
    private String phone;
    /**
     * 密码
     */
    @Pattern(regexp = "^[0-9]{3,18}$",message = "密码必须在3到18位数字之间")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee() {
    }


    public Employee(String name, Integer age, Integer sex, String address, String phone, String password) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phone = phone;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
