import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class High_vowels_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int count=0;
		int max=0;
		int temp1;
		HashMap<String,Integer>t=new HashMap<String,Integer>();
		StringTokenizer st=new StringTokenizer(s," ");
		
		while(st.hasMoreTokens())
		{
			count=0;
			String temp=st.nextToken();
			char[]a =temp.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
				{
					 count++;
				}
				
			}
			t.put(temp,count);
			
			
		}
		System.out.println("after tokens and count"+t);
		Set s1=t.entrySet();
		   Iterator it=	s1.iterator();
		   
		   while(it.hasNext())
		   {
			   
			   Map.Entry me=(Map.Entry)it.next();
			   temp1=(int)me.getValue();
			   if (temp1>max);
			   {
				   max=temp1;
				   System.out.println(max);
			   }
			   
		   }
		  // System.out.println(max);
		   System.out.println("++++++++++++++++++++++++++++++++++++++");
		   Set s2=t.entrySet();
		   Iterator itr=s2.iterator();
		   String key=null;
		   while(itr.hasNext())
		   {
			   Map.Entry me2=(Map.Entry)itr.next();
			   //System.out.println(me2.getKey()+" "+me2.getValue());
			   if((int)me2.getValue()==max)
			   {
				   System.out.println(max+""+me2.getKey());
				   break;
			   }
			
			   
		   }
		
	}

}
