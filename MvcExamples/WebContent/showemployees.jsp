<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,data.Employee_1"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employee Information
<table border="1" width="90%" >
<tr>
	<th> EmpId </th>
	<th> Name </th>
	<th> Designation </th>
	<th> Department </th>
	<th> Email </th>
</tr>
<%
List<Employee_1> list=(List<Employee_1>)request.getAttribute("list");
%>
<c:set var="list1" value="${list}" > </c:set>
<c:forEach  var="u" items="${list1}">
<tr>
	<td> ${u.getEmpid()} </td> 
	<td> ${u.getEname()} </td> 
	<td> ${u.getDept()} </td> 
	<td> ${u.getDesg()} </td> 
	<td> ${u.getEmail()} </td> 
</tr>
</c:forEach>
</table>
</body>
</html>