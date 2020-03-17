<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*,java.util.*"%>


 <% 
 try
 {
	 response.setContentType("text/html");
	 int flag=0;
     String user=request.getParameter("id");
     String pass=request.getParameter("password");
     Class.forName("com.mysql.jdbc.Driver");
     Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cts1","root","root");
     Statement st=con.createStatement();
     String qry="select * from users";
    ResultSet rs=st.executeQuery(qry);
while(rs.next())
{
	if(rs.getString(1).equals(user)&&rs.getString(2).equals(pass))
	{
		flag=1;
	}
}
if(flag==1)
{
   if(user.equals("admin")&&pass.equals("admin"))
   {
	   System.out.println("found");
   %>
	<jsp:forward page="admin.jsp"></jsp:forward>
<% 
   }

  else
	{
%> 
	<jsp:forward page="associate.jsp"></jsp:forward>
<% 
	}
}
else
{
	System.out.println("not found");
}

 }
 catch(Exception e)
 {
	 System.out.println(e);
 }
 finally
 {
	 
 }
%>


</body>
</html>