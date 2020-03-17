import java.sql.*;
import java.util.Scanner;
public class Prepare {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
        String q="select * from javadt where courseid=?";
        PreparedStatement pst=con.prepareStatement(q);
        Scanner sc=new Scanner(System.in);
        
       // System.out.println("enter course");
       // String c=sc.next();
        System.out.println("enter courseid");
        int id=sc.nextInt();
        
      //  System.out.println("enter clg");
        //String clg =sc.next();
        pst.setInt(1,id);
        //pst.setInt(2,id);
        //pst.setString(3,clg);
        ResultSet rs=pst.executeQuery();
       if(rs.next())
       {
    	   System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3));
       }
       else
       {
    	   System.out.println("no row is selected");
       }
        pst.close();
	}
	

}
