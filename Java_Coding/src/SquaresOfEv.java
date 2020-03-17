import java.util.Scanner;

public class SquaresOfEv {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("enter number");
	        int n=sc.nextInt();
	        int rem,sum=0;
	        while(n>0)
	        {
	        	rem=n%10;
	        	if(rem%2==0)
	        	sum=sum+rem*rem;
	        	n=n/10;
	        	
	        }
           System.out.println("sum of squares of even digits:"+sum);
	}

}
