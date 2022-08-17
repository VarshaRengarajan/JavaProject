<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display bean properties</title>
</head>
<body>
<jsp:useBean id="Bean" class="jsp.practice.bean" scope="session"></jsp:useBean>
         Id:    <jsp:getProperty name="Bean" property="id" />  <br>
        Entry Name:    <jsp:getProperty name="Bean" property="name" />  <br>
        Age:    <jsp:getProperty name="Bean" property="age" />  <br>
        Dept:    <jsp:getProperty name="Bean" property="dept" />  <br>


</body>
</html>