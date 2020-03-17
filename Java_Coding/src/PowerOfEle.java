import java.util.Scanner;
public class PowerOfEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<n;i++)
        {
        	sum=sum+Math.pow(a[i],i);
        }
        System.out.println((int)sum);
        	
	}

}
