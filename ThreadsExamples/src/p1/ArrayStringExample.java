package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayStringExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList ar=new ArrayList();
		int max=0;
		String name2 = null;
		System.out.println("enter no of students");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			ar.add(sc.next());
		}
		
        Iterator i=	ar.iterator();
        while(i.hasNext())
        {
        	String temp=(String)i.next();
        	StringTokenizer st=new StringTokenizer(temp,"-");
        	String name=st.nextToken();
        	int m1=Integer.parseInt(st.nextToken());
        	int m2=Integer.parseInt(st.nextToken());
        	int m3=Integer.parseInt(st.nextToken());
        	int total=m1+m2+m3;
        	if(total>=max)
        	{
        		max=total;
        		name2=name;
        	}
        }
        System.out.println("topper"+name2+" "+max);
		

	}

}
