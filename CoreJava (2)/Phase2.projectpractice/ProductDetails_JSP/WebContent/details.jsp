<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>ENTER THE PRODUCT DETAILS</b>
<form action="process.jsp">
<input type="text" name="product_id" value="Id" onclick="this.value=''"/><br/>  
<input type="text" name="product_name"  value="Name" onclick="this.value=''"/><br/>  
<input type="text" name="product_price"  value="Price" onclick="this.value=''"/><br/>  
<input type="text" name="product_category"  value="Category" onclick="this.value=' '"/><br/>  

<input type="submit" value="Submit"/>  

</form>

</body>
</html>