<%--
  Created by IntelliJ IDEA.
  User: zhoupan
  Date: 9/19/16
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table border="1" width="400" align="center">
    <%
        for (int i = 0; i < 10; i++) {
    %>
    <tr>
        <td>这是动态产生的第<%=i%>行</td>
    </tr>
    <%}%>
</table>
</body>
</html>
