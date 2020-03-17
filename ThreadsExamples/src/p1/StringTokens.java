package p1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer str=new StringTokenizer(s," ");
		
		String s1=str.nextToken();
		while(str.nextToken()=="")
		{
			
	        char ch=s1.charAt(s1.length()-1);
	        System.out.println(ch);
	        str.nextToken();
	         /* int temp=(int)ch;
	         
	          temp=temp-31;
		    System.out.print((char)temp+"$");
		     s1=str.nextToken();*/
		
		}
		

	}

}
