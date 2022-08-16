<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Display all the details</b></br>
<jsp:useBean id="Product" class="project.productportal.Product" scope="session"></jsp:useBean>
        <jsp:setProperty property="product_id" name="Product" />
        <jsp:setProperty property="product_name" name="Product" />
        <jsp:setProperty property="product_price" name="Product" />
        <jsp:setProperty property="product_category" name="Product" />
<a href="process1.jsp">Fetch and display the details</a><br>
</body>
</html>