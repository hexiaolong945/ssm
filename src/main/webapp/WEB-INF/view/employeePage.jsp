<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
<head>

    <!-- 设置当前页面基础路径 -->
    <base href="<%=basePath %>" >
<body>

<table border="1">
    <tr>
        <td>员工姓名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>地址</td>
        <td>手机号码</td>
    </tr>
    <c:forEach items="${employees}" var="emp">
        <tr>
            <td>${emp.name}</td>
            <td>${emp.age}</td>
            <c:if test="${emp.sex == 1}">
                <td>男</td>
            </c:if>
            <c:if test="${emp.sex == 0}">
                <td>女</td>
            </c:if>
            <td>${emp.address}</td>
            <td>${emp.phone}</td>
            <td><a href="emp/empEdit.do?id=${emp.id}">修改</a></td>
            <td><a id="delete" onclick="emp_delete(${emp.id})" href="javascript:;">删除</a></td>
        </tr>
    </c:forEach>

    <a href="emp/editPage.do">添加员工信息</a>


</table>

</body>

<script type="text/javascript" src="lib/jquery/1.11.3/jquery.min.js"></script>
<script type="text/javascript">

    function emp_delete(id) {
        var flag = confirm("是否要删除此条员工信息");
        if (flag){
            $.ajax({
                type:"get",
                url:"emp/empDelete.do?id="+id,
                dataType:"json",
                success:function (data) {
                    alert(data.message);
                    location.reload();
                }
            })
        }
    }



</script>

</html>
