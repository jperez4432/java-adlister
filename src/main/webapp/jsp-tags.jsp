<%--
  Created by IntelliJ IDEA.
  User: juanperez
  Date: 6/30/21
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--Include files from file structure--%>
<%--<%@include file=""%>--%>
<%----%>
<%--<%@taglib prefix=""%>--%>



<%--! lets us declare variables--%>
<%! int instanceCount = 0; %>
<%--to execute java--%>
<%
    int localCount =1;
    localCount += 1;
    instanceCount +=1;
%>

<html>
<head>
    <title>JSP tags</title>
</head>
<body>
<h1>Hello there</h1>
<%--    use <%= to use variables from above %>--%>
<h2>The local count is <%= localCount %></h2>
<h2>The instance count is <%= instanceCount %></h2>
<%@include file="partials/navbar.jsp"%>
<%@include file="partials/national-parks.jsp"%>
</body>
</html>