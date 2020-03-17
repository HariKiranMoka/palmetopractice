import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
public class RBF {

	public static void main(String[] args) {
		try
		{
			FileInputStream fis=new FileInputStream("D:\\cts java\\Exapmles_27\\src\\data.properties");
			Properties p=new Properties();
			p.load(fis);
			String dname=(String)p.get("Dname");
			String url=(String)p.get("Url");
			String username=(String)p.get("Uname");
			String password=(String)p.get("pwd");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter table");
			String table=sc.next();
			Class.forName(dname);
			System.out.println("driver loaded");
			Connection con=DriverManager.getConnection(url,username,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from "+table);
			ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			System.out.println("==============================");
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println(rsmd.getColumnName(i)+" ");
			}
			System.out.println(" ");
			System.out.println("==========================");
			while(rs.next())
			{
				for(int j=1;j<=rsmd.getColumnCount();j++)
				{
					System.out.println(rs.getString(j)+" ");
				}
				System.out.println(" ");
			}
			
			con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
			
		
	
					
	}
}
	


