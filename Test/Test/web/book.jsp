<%--
  Created by IntelliJ IDEA.
  User: 墨明棋妙
  Date: 2018/9/19
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1px" style="align-content: center">
        <caption>书籍列表</caption>
        <tr>
            <th>编号</th>
            <th>书籍名称</th>
            <th>作者</th>
            <th>出版日期</th>
            <th>类型</th>
        </tr>
        <c:forEach items="${requestScope.book}" var="bk">
        <tr>
            <td>${bk.id}</td>
            <td>${bk.name}</td>
            <td>${bk.author}</td>
            <td>${bk.time}</td>
            <td>${bk.type}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
