package ioexample;

import java.io.*;

import java.util.Scanner;
 @SuppressWarnings("unchecked")//Do not delete this line
public class Main
{
	public static void main(String[] args) 
	{
	    FileManager f=new FileManager();
	    File f1=f.createFile();
	    Scanner sc=new Scanner(System.in);
	  // Scanner sc=new Scanner(System.in);
	    String br=null;
	    
	    System.out.println("Enter Name");
	    br=sc.next();
	    br=br+",";
	    System.out.println("Enter Phone Number");
	    String phno=sc.next();
	    br+=phno;
	    br+=",";
	    System.out.println("Enter Email");
	    String email=sc.next();
	    br+=email;
	    br+=";";
	    
	    
	   while(true)
	   {
		   System.out.println("Do you want to enter another record(yes/no)");
		   String s=sc.next();
		   if(s.equalsIgnoreCase("yes"))
		   {
			   
			   
			    System.out.println("Enter Name");
			    br+=sc.next();
			    br=br+",";
			    System.out.println("Enter Phone Number");
			    String phno1=sc.next();
			    br+=phno1;
			    br+=",";
			    System.out.println("Enter Email");
			    String email1=sc.next();
			    br+=email1;
			    br+=";";
			    f.writeFile(f1,br);
		   }
		   else
		   {
			   String[] s2=f.readFile(f1);
			   for(String s1:s2)
			   {
				   System.out.println(s1);
			   }
			  break;
		   }
	   }
	    
	    
	    
	}
    
}
