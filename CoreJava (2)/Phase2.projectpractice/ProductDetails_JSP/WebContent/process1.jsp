<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Product" class="project.productportal.Product" scope="session"></jsp:useBean>
         Product Id:    <jsp:getProperty name="Product" property="product_id" />  <br>
        Product Name:    <jsp:getProperty name="Product" property="product_name" />  <br>
        Product price:    <jsp:getProperty name="Product" property="product_price" />  <br>
        Product category:    <jsp:getProperty name="Product" property="product_category" />  <br>


</body>
</html>