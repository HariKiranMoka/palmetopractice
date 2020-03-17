import java.util.*;
public class IntegerExc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println(s1);
		try
		{
			int x=Integer.parseInt(s1);
			System.out.println("the square value is:"+x*x);
			
		}
		catch(Exception e)
		{
			System.out.println("entererd input is not a valid format of an integer");
		}

	}

}
