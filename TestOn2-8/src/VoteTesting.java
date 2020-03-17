import java.util.Scanner;

class Testing
{
	public void testAge(int age) throws InvalidAgeException,InSufficientException
	{
		if(age<0)
		{
			throw new InvalidAgeException();
		}
		else if(age>0&&age<18)
		{
			throw new InSufficientException();
		}
		else
		{
			System.out.println("age is valid");
		}
	}
}
public class VoteTesting {

	public static void main(String[] args) throws InSufficientException  
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		Testing t=new Testing();
		try
		{
			t.testAge(age);
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i);
		}
		catch(InSufficientException in)
		{
			System.out.println(in);
		}

	}

}
