<%--
  Created by IntelliJ IDEA.
  User: zhoupan
  Date: 9/19/16
  Time: 8:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>网页访问计数</title>
</head>
<body>
<%! int count=0;%>
<%
    count++;
%>
<p align="center">
    此页面被访问了<%=count%>次
</p>
</body>
</html>
