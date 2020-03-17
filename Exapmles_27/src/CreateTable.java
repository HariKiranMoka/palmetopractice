import java.sql.*;
public class CreateTable {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
        Statement st=con.createStatement();	
        boolean flag=st.execute("create table javadt"
        		+ "(course varchar(10),courseId int(10),clgname varchar(10));");
        if(flag)
        {
        	System.out.println("table created");
        }
        else
        {
        	System.out.println("not created");
        }

	}

}
