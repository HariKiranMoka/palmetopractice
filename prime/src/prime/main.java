package prime;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		if(UserMainCode.isPrime(p))
		System.out.println("prime");
		else
			System.out.println("not prime");
		

	}

}
