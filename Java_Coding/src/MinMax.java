import java.util.Scanner;

public class MinMax {
       public int dif(int a[],int n)
       {
    	   if(n>1)
    	   {
    	   int min=a[0];
    	   for(int i=0;i<n;i++)
    	   {
    		   if(a[i]<min)
    			   min=a[i];
    	   }
    	   int max=a[0];
    	   for(int i=0;i<n;i++)
    	   {
    		   if(a[i]>max)
    			   max=a[i];
    		   
    	   }
    	   return max-min;
    	   }
    	   else
    		   return a[0];
		   
    	   
       }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        MinMax m=new MinMax();
        System.out.println(m.dif(a, n));
	}

}
