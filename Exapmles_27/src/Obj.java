import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import com.mysql.cj.xdevapi.Statement;

public class Obj {
	Connection createConnection() throws SQLException
	{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		return con;
	}
	void insertData(Connection con,String c,int i,String clg) throws SQLException
	{
	
		Statement st=(Statement) con.createStatement();
		String qry="insert into javadt values('c',i,'clg')";
		int count= st.executeUpdate(qry);
	
	}

	public static void main(String[] args) throws SQLException {
		Obj o=new Obj();
		Connection con=o.createConnection();
		o.insertData(con, "cse", 78, "Lbrce");

	}

}
