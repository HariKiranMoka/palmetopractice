<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="d" class="p1.Details"></jsp:useBean>
<jsp:setProperty property="name" name="d"/>
<jsp:setProperty property="pwd" name="d"/>
details are
<jsp:getProperty property="name" name="d"/>
<jsp:getProperty property="pwd" name="d"/>
<%
try
{
String user=request.getParameter("uname");
String pass=request.getParameter("pwd");
int count=0;
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
String q="select * from customers";
PreparedStatement pst=con.prepareStatement(q);
ResultSet rs=pst.executeQuery();
while(rs.next())
{
	if(pass.equals(rs.getString(2)))
			{
		       count=1;
			}
}
if(count==1)
{
	out.println("registered");
}
else
{%>
    <% out.println("unauthorised");%>
    <!--> <h2>u are to be register first</h2>
	<jsp:forward page="login.html"/>
	-->
<% 
}
}
catch(Exception e)
{
	out.print(e);
}
%>-->
</body>
</html>