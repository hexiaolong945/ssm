<%--
  Created by IntelliJ IDEA.
  User: hxl
  Date: 2020/9/19
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <p style="color: red">格式有误，错误为：</p>
    <c:if test="${errors != null && errors.size() > 0}">
        <c:forEach items="${errors}" var="err" >
            ${err.defaultMessage}<br/>
        </c:forEach>
    </c:if>

</body>
</html>
