<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*"%>


 <% 
int flag=0;
 String user=request.getParameter("first");
String pass=request.getParameter("second");
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement st=con.createStatement();
String qry="select * from users";
ResultSet rs=st.executeQuery(qry);

while(rs.next())
{
%>
<table border=1>
    <tr><td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td></tr>
 
</table>
	

<%} 
%>-->
</body>
</html>