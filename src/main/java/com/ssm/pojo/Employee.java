package com.ssm.pojo;

/**
 * @data 2020/9/18 21:23
 * 员工表
 */
public class Employee {
    /**
     * 员工姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别：0为女，1为男
     */
    private Integer sex;
    /**
     * 地址
     */
    private String address;
    /**
     * 电话号码
     */
    private String phone;
    /**
     * 密码
     */
    private String password;



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
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
