package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import data.Employee_1;

public class Employee_1Dao {
	  public static Connection con=null;
	  List<Employee_1>list=new ArrayList<Employee_1>();
     public static Connection getConnection() throws ClassNotFoundException, SQLException 
     {
    	
    	 Class.forName("com.mysql.jdbc.Driver");
    	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
    	 return con;
    	 
     }
     public void insertEmployee(Employee_1 emp) throws ClassNotFoundException, SQLException
     {
    	 
    	 
     }
     public List<Employee_1> showEmployees() 
     {
    	 
    	 try
    	 {
    	
    	 Connection con=getConnection();
    	 Statement ps=con.createStatement();
    	 ResultSet rs=ps.executeQuery("select * from employee_1");
    	 while(rs.next())
    	 {
    		 Employee_1 u=new Employee_1();
    		 u.setEmpid(rs.getInt(1));
    		 u.setEname(rs.getString(2));
    		 u.setDept(rs.getString(3));
    		 u.setDesg(rs.getString(4));
    		 u.setEmail(rs.getString(5));
    		 list.add(u);
    	 }
    	
     	
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println(e);
    	 }
    	 return list; 
     }
}
