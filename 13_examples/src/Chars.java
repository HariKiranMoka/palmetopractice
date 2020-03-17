import java.util.*;
public class Chars {

	public static void main(String[] args) {
		 String s=new String();
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("enter string");
		 s=sc.nextLine();
		
		 
		  if(s.charAt(0)=='j'&&s.charAt(1)=='b')
		 {
			 System.out.println(s);
		 }
		 
		 
		 else if(s.charAt(0)=='j')
		 {
			 String s1;
			 s1=s.substring(0,1);
			
			
			System.out.println(s1.concat(s.substring(2)));
			 
			 
		 }
		 else  if(s.charAt(1)=='b')
		 {
			 System.out.println(s.substring(1,s.length()));
		 }
		 else
		 {
			 System.out.println(s.substring(2));
		 }
		 
		 

	}

}
