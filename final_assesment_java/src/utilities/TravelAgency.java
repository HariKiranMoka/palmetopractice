package utilities;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class TravelAgency {
	static Connection connection;
	public static void main (String[] args) throws SQLException, ClassNotFoundException, IOException
	{
		connection=DBHandler.establishConnection();
		FileInputStream fis=new FileInputStream("D:\\cts java\\final_assesment_java\\WebContent\\VarshTourPackageDetails.txt");
		DataInputStream dis=new DataInputStream(fis);
		BufferedReader br=new BufferedReader(new InputStreamReader(dis));
		PreparedStatement pst=connection.prepareStatement("insert into Package_Details values(?,?,?,?,?)");
		String strLine;
		Package p=new Package();
		ArrayList list=new ArrayList();
		ArrayList list1=new ArrayList();
		try {
			strLine=br.readLine();
			while(strLine!=null)
			{
				list.add(strLine);
				strLine=br.readLine();
				
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator itr=list.iterator();
		String id="",source="",des="";
		double cost = 0,discount = 0;
		
		int nod = 0;
		while(itr.hasNext())
		{
			
			String str=(String) itr.next();
			String[] str1=str.split(",");
			for(int i=0;i<str1.length;i++)
			{
				id=str1[0];
				
				boolean flag=validation(id);
				System.out.println(flag);
				
				if(flag==true)
				{
					source=str1[1];
					des=str1[2];
					cost=Float.parseFloat(str1[3]);
					nod=Integer.parseInt(str1[4]);
					
					if(nod<=5)
					{
						discount=0;
					}
					else if(nod>5&&nod<=8)
					{
						discount=0.03;
					}
					else if(nod>8&&nod<=10)
					{
						discount=0.05;
					}
					else
					{
						discount=0.07;
					}
				}
			}
					double tcost;
					tcost=cost*nod;
					
					double dcost=tcost-(tcost*discount);
					
					double gcost=dcost+(dcost*0.12);
					
				
					pst.setString(1,id);
					pst.setString(2,source);
					pst.setString(3,des);
					pst.setInt(4,nod);
					pst.setDouble(5,gcost);
					p.setPackageId(id);
					p.setSourcePlace(source);
					p.setDestinationPlace(des);
					p.setNoOfDays(nod);
					p.setPackageCost(gcost);
			 
					pst.executeUpdate();
			
		}
	       
				list1.add(p);
		System.out.println("db records inserted sucess");
		
		
	}
	static boolean  validation(String packageId)
	{
		boolean v=false;
		if(Pattern.matches("[0-9]{3}/[A-Z]{3}", packageId))
			v=true;
		return v;
		
		
	}

}
