package linearsearch;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	        int n;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter size");
	        n=sc.nextInt();
	        int[] a=new int[n];
	        int[] b=new int[n];
	        for(int i=0;i<n;i++)
	        {
	        	 a[i]=sc.nextInt();
	        	  
	        }
	        System.out.println("Enter second array elements");
	        for(int j=0;j<n;j++)
	        b[j]=sc.nextInt();
	        
	        System.out.println(UserMainCode.sumofSame(a,b));
            
	}

}
