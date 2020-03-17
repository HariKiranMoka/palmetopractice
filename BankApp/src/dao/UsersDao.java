package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dto.Accounts;
import dto.Users;

public class UsersDao {
	public static String jdbcURL;
    public static String jdbcUsername;
    public static String jdbcPassword;
    public static Connection jdbcConnection;
	 public UsersDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
	        this.jdbcURL = jdbcURL;
	        this.jdbcUsername = jdbcUsername;
	        this.jdbcPassword = jdbcPassword;
	    }
	     
	    public static void connect() throws SQLException {
	        if (jdbcConnection == null || jdbcConnection.isClosed()) {
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	            } catch (ClassNotFoundException e) {
	                throw new SQLException(e);
	            }
	            jdbcConnection = DriverManager.getConnection(
	                                        jdbcURL, jdbcUsername, jdbcPassword);
	        }
	    }
	     
	    public void disconnect() throws SQLException {
	        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
	            jdbcConnection.close();
	        }
	    }
	    public static void createCustomer(Accounts account,Users user) throws SQLException {
	    	
	    	connect();
	    	String sql1 = "insert into users values(?,?)";
	    	String sql2 = "insert into Accounts values (?,?,?,?)";
	    	PreparedStatement pst1 = jdbcConnection.prepareStatement(sql1);
	    	PreparedStatement pst2 = jdbcConnection.prepareStatement(sql2);
	    	pst1.setString(1, user.getUname());
	    	pst1.setString(2, user.getPasswd());
	    	pst1.executeUpdate();
	    	pst2.setString(1, account.getAcno());
	    	pst2.setString(2, account.getName());
	    	pst2.setString(3, account.getActtype());
	    	pst2.setFloat(4, account.getBalance());
	    	pst2.executeUpdate();
	    	
	    	
	    }
	     
               public int checkUsers(Users user) throws SQLException
               {
            	   String sql="select * from users";
            	   connect();
            	   Statement statement = jdbcConnection.createStatement();
                   ResultSet resultSet = statement.executeQuery(sql);
                    int flag=0;
                   while (resultSet.next())
                   {
                	  String temp1= resultSet.getString("uname");
                	   String temp2=resultSet.getString("passwd");
                	   if(temp1.equals(user.getUname())&&temp1.equals(user.getPasswd()))
                	   {
                		   flag=1;
                		   break;
                	   }
                   }
                   resultSet.close();
                   statement.close();
                   
            	   return flag;
               }
}
