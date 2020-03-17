import java.util.Scanner;
public class StringCon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.next();
        System.out.println("enter n");
        int n=sc.nextInt();
        if(n<s.length()/2)
        {
        String s1=s.substring(0,n);
        String s2=s.substring(s.length()-n,s.length());
        System.out.println(s1.concat(s2));
        }
        else
        {
        	System.out.println("invalid n");
        }
	}

}
