<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.io.*,java.util.*,java.sql.*,javax.servlet.*,javax.servlet.http.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="<%=request.getParameter(\"name\")%>"></c:set>
<c:set var="pwd" value="<%=request.getParameter(\"pwd\")%>"></c:set>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost/cts" user="root" password="root"/>

<sql:update dataSource="${db}" var="count">
insert into customers values(?,?);
<sql:param value="${name}"></sql:param>
<sql:param value="${pwd}"></sql:param>
</sql:update>


  <table border="2" width="100%">
      <tr>
        <th>name</th>
        <th>id</th>
      </tr>
      <c:forEach var="table" items="${rs.rows}">
          <tr>
            <td><c:out value="${table.name}"></c:out></td>
            <td><c:out value="${table.id}"></c:out></td>
          </tr>
      </c:forEach>
</table>

</body>
</html>