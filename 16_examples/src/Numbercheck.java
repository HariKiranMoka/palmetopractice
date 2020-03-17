import java.util.Scanner;
public class Numbercheck {

	public static void main(String[] args)throws ExceptionOd,ExceptionEv {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		Condition c=new Condition();
		try
		{
			 c.number(x);
		}
		catch(ExceptionOd e)
		{
			System.out.println(e);
		}
		catch(ExceptionEv e)
		{
			 System.out.println(e);
		}

	}

}
