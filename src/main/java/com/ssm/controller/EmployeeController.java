package com.ssm.controller;

import com.ssm.pojo.Employee;
import com.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @data 2020/9/18 22:34
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/show")
    public String show(HttpServletRequest request, Model model){
        Employee employee = employeeService.selectById(1);
        model.addAttribute("Employee", employee);
        return "showEmployee";
    }


}
