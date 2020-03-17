import java.util.Scanner;
public class Single {
	 int rem;
	 int sum=0;
	  
	 public int sumOfSingle(int val)
	 {
		 sum=0;
		 while(val>0)
		 {
			 rem=val%10;
			 sum=sum+rem;
			 val=val/10;
		 }
		 return sum;
	 }

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int val=sc.nextInt();
		 Single obj=new Single();
		 int a;
		    a=obj.sumOfSingle(val);
		    
           while(a>9)
           {
        	   a=obj.sumOfSingle(a);
        	   
           }
           System.out.println(a);
		     
	        
		  
		 	}

}
