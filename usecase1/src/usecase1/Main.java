package usecase1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args)
    {
		
       Scanner sc=new Scanner(System.in);
        int n,i=0,pod=1,poe=1,c=0;
        int a[] =new int[100];
        System.out.println("Enter the distance travelled");
        n=sc.nextInt();
        if(n>=0)
        {
        while(n>0)
        {
            a[i]=n%10;
            n=n/10;
            i++;
            c++;
        }
        
       
        for( i=0;i<c;i=i+2)
        {
             poe=poe*a[i];
             System.out.println(poe);
        }
         for(i=1;i<c;i=i+2)
        {
            pod=pod*a[i];
        }
        if(pod>poe)
        {
            System.out.println("Your bonus points is "+pod);
        }
       else
       {
           System.out.println("Your bonus points is "+poe);
           
       }
     }
     else
     {
         System.out.println("Invalid Input");
     }
    }  
 
}