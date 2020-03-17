import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class Array {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int x=sc.nextInt();
		int[] a=new int[x];
		System.out.println("enter array elements");
		for(int i=0;i<x;i++)
		{
			a[i]=sc.nextInt();
		}
		
		try
		{
			System.out.println("enter index");
			int ind=sc.nextInt();
				
					System.out.println("element at"+ind+""+a[ind]);
		}
        catch(ArrayIndexOutOfBoundsException e)
		{
        	System.out.println(e);
		}
	}

}
