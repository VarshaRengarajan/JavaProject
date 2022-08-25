<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>USER DETAILS</b>
<center>
<table  border="6">

<tr>
<th>User Id</th>
<th>Email</th>
<th>Mobile no</th>
<th>User Name</th>  



</tr>
<c:forEach var="users" items="${userList}">

<tr>
  
<td>${users.id}</td>


<td>${users.email}</td>
<td>${users.mobile}</td>
<td>${users.name}</td>

<td><a href="edituser/${users.id}">Update</a></td>
</tr>
</c:forEach>

</table>
</center>

</body>
</html>