import java.util.Scanner;
public class ReverseOfNum {

	public static void main(String[] args) {
		   int sum=0,n1,rem=0;
		   Scanner sc=new Scanner(System.in);
		   int n;
		   System.out.println("enter size of array");
		   n=sc.nextInt();
		   System.out.println("enter element ");
		   int ele=sc.nextInt();
	       int[] a=new int[n];
	       System.out.println("enter array elements");
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=sc.nextInt();
	       }
	       
	       
	       for(int i=0;i<n;i++)
	       {
	    	   if(a[i]>ele)
	    	   {
	    		    sum=sum+a[i];
	    	   }
	       }
	       while(sum>0)
	       {
	    	   n1=sum%10;
	    	   rem=(rem*10)+n1;
	    	   sum=sum/10;
	    	   
	       }
	       System.out.println(rem);
	       

	}

}
