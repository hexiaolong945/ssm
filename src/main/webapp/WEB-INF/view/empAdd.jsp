<%--
  Created by IntelliJ IDEA.
  User: hxl
  Date: 2020/9/19
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset=utf-8" />
    <title>添加员工</title>
    <!-- 设置当前页面基础路径 -->
    <base href="<%=basePath %>" >
</head>
<body>
<table width="700" border="3" align="center" cellspacing="0" bordercolor="#7092BE" bgcolor="#FF8080" >
    <tr>
        <td >
            <center><h1>员工信息登记表</h1></center>
            <form name="empForm" method="post" action="emp/insert.do">
                真实姓名：&nbsp;&nbsp;&nbsp;&nbsp;<input name="name" type="text" placeholder="张三" size="20">（必填，只能输入汉字）<p>
                密码：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="password" type="password">（请输入密码）<p>
                年龄：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="age" type="text" placeholder="24" size="20">（必填）<p>
                性别：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <label><input name="sex" type="radio" value="1" checked />男 </label>
                            <label><input name="sex" type="radio" value="0" />女 </label> （必填）<p>
                地址：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="address" size="20">（必填）<p>
                手机号码：&nbsp;&nbsp;&nbsp;<input type="text" name="phone" size="20">（必填）<p>
                <center>
                    <input name="提交" type="submit" value="提交"  style="height:40px;width:80px;"/>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input name="重置" type="reset"   value="重置"  style="height:40px;width:80px;"/>
                </center>
            </form>
        </td>
    </tr>
</table>
</body>
</html>

