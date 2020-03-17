import java.util.Scanner;

public class Panver {

	public static void main(String[] args) {
		PanCheck p=new PanCheck();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pannumber");
		String s=sc.next();
		int x=p.panvalidate(s);
		if(x==1)
		{
			System.out.println("valid pan");
		}
		else
		{
			System.out.println("invalid pan");
		}
		
		

	}

}
