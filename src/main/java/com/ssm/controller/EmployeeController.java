package com.ssm.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.ssm.Util.Message;
import com.ssm.pojo.Employee;
import com.ssm.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingErrorProcessor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * @data 2020/9/18 22:34
 */
@Controller
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 显示员工表的员工信息
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(HttpServletRequest request, Model model){
        List<Employee> employees = employeeService.selectAll();
        model.addAttribute("employees", employees);
        return "employeePage";
    }

    /**
     * 员工添加页面
     * @return
     */
    @RequestMapping(value = "/editPage",method = RequestMethod.GET)
    public String AddPage(){
        return "empAdd";
    }

    /**
     * 插入一名员工信息
     * @param employee
     * @param result
     * @param model
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(@Validated Employee employee, BindingResult result,Model model){
        if (result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError objectError : allErrors) {
                System.out.println(objectError.getDefaultMessage());
            }
            model.addAttribute("errors", allErrors);
            return "error";
        }

        int insert = employeeService.insert(employee);
        if (insert < 1) {
            model.addAttribute("message", new Message(1, "添加失败"));
            return "wrong";
        }

        model.addAttribute("message", new Message(0, "添加成功"));
        return "success";
    }

    @RequestMapping(value = "/empEdit",method = RequestMethod.GET)
    public String editPage(int id,Model model){
        Employee employee = employeeService.selectById(id);
        model.addAttribute("emp", employee);
        return "empEdit";
    }

    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    public String edit(Employee employee,Model model){
        int result = employeeService.EmployeeEdit(employee);
        if (result < 1) {
            model.addAttribute("message",new Message(1, "修改失败"));
            return "wrong";
        }
        model.addAttribute("message",new Message(0, "修改成功"));
        return "success";
    }

    @RequestMapping(value = "/empDelete",method = RequestMethod.GET,produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String delete(int id){
        Message message;
        System.out.println("id:"+id);
        int i = employeeService.deleteById(id);
        if (i < 1){
            message = new Message(1, "删除失败");
            return JSON.toJSONString(message);
        }

        message = new Message(0, "删除成功");
        return JSON.toJSONString(message);
    }

}
