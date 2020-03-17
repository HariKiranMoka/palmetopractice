import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of employees");
		int nofemp=sc.nextInt();
		HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();
		for(int i=0;i<nofemp;i++)
		{
			h.put(sc.nextInt(),sc.nextInt());
		}
		//System.out.println(h);
		ArrayList<Integer>al=new ArrayList<Integer>();
		Set s=h.entrySet();
	   Iterator it=	s.iterator();
	   int max=0;
	   while(it.hasNext())
	   {
		   Map.Entry me=(Map.Entry)it.next();
		   if (max<(int)me.getValue());
		   {
			   max=(int)me.getValue();
		   }
		   
	   }
	   Collections.sort(al);
	   System.out.println(al);
	   for(int i=0;i<3;i++)
	   {
		    
	   }
	   
		//System.out.println("sum is"+sum);
	}

}
