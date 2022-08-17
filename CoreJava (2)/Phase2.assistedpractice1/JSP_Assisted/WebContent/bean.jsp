<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Usage of useBean tag<br>
<jsp:useBean id="Bean" class="jsp.practice.bean" scope="session"></jsp:useBean>
        <jsp:setProperty property="id" name="Bean" />
        <jsp:setProperty property="name" name="Bean" />
        <jsp:setProperty property="age" name="Bean" />
        <jsp:setProperty property="dept" name="Bean" />

<a href="showbean.jsp">Access bean properties from another page</a><br>
<a href="forward.jsp">Use Forward action to go to Google</a><br>

<hr>

<jsp:text>
        <![CDATA[This is my content.<br/>This will show within a text action tag exactly as it has been entered]]>
</jsp:text>


</body>
</html>