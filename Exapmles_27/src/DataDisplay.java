import java.sql.*;
public class DataDisplay {

	public static void main(String[] args) throws SQLException {
		                                                                           
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
            Statement st=con.createStatement();
            String q=" emp1 set ename='kiran' where empno=1002";
            int c=st.executeUpdate(q);
           /* ResultSet rs=st.executeQuery("select * from emp1");
            while(rs.next())
            {
            	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
            }
            rs.close();*/
            System.out.println(c);
            st.close();
            con.close();
	}

}

