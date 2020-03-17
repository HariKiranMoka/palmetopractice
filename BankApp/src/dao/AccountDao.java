package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Accounts;

public class AccountDao {
	
	public static String jdbcURL;
    public static String jdbcUsername;
    public static String jdbcPassword;
    public static Connection jdbcConnection;
	 public AccountDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
	public static void deposit(String acct,float amount) throws SQLException 
	{
		 connect();
		 String qry="update accounts set balance=balance+? where acno=?";
		 PreparedStatement pst=jdbcConnection.prepareStatement(qry);
		 pst.setFloat(1,amount);
		 pst.setString(2, acct);
		 int status=pst.executeUpdate();
		 System.out.println("Amount Deposited");
	}
	public static void withdraw(String acct,float amount) throws SQLException
	{
		 connect();
		 String qry="update accounts set balance=balance-? where acno=?";
		 PreparedStatement pst=jdbcConnection.prepareStatement(qry);
		 pst.setFloat(1,amount);
		 pst.setString(2, acct);
		 int status=pst.executeUpdate();
		 System.out.println("Amount withdraw");
	}
	public static int getBalance(String acno) throws SQLException
	{
		connect();
		 String qry="select balance from Accounts where acno=?";
		 
		 PreparedStatement pst=jdbcConnection.prepareStatement(qry);
		 pst.setString(1, acno);
		 ResultSet rs=pst.executeQuery();
		 System.out.println("available bal"+rs.getFloat(1));
		
		return 0;
	}

}
