
public class Condition {
	public void number(int n) throws ExceptionEv,ExceptionOd
	{
		if(n%2==0)
		{
			throw new ExceptionEv();
		}
		else
		{
			throw new ExceptionOd();
		}
	}

	
	

}
