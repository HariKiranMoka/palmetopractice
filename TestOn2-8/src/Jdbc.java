import java.util.Scanner;
import java.sql.*;
public class Jdbc {

	public static void main(String[] args) {
		try {
			 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
			 String q="insert into Employee values(?,?,?,?,?,?)";
			 
		     PreparedStatement pst= con.prepareStatement(q);	
		     
		     Scanner sc=new Scanner(System.in);
		     System.out.println("enter the name");
		     String name=sc.next();
		     System.out.println("enter id");
		     int id=sc.nextInt();
		     System.out.println("enter the dept");
		     String dept=sc.next();
		     System.out.println("enter the desg");
		     String desg=sc.next();
		     System.out.println("enter the company");
		     String comp=sc.next();
		     System.out.println("enter the email");
		     String email=sc.next();
		     pst.setString(1,name);
		     pst.setInt(2,id);
		     pst.setString(3,dept);
		     pst.setString(4,desg);
		     pst.setString(5,comp);
		     pst.setString(6,email);
		    int rs=pst.executeUpdate();
		     if(rs==1)
		     {
		    	 System.out.println("insertion sucess");
		     }
		     else
		     {
		    	 System.out.println("not sucess");
		     }
		    pst.close();
		    con.close();
		     
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}

}
