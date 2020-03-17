package prime;

public class UserMainCode {
	public static boolean isPrime(int num)
	{
		
		int count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
				
		}                                                                                                                                                                                                                                                                                                                                                          
		if(count==2)
			return true;
		else
			return false;
	}

}
