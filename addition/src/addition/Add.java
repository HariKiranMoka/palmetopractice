package addition;

public class Add {

	public static int main(String[] args) {
		  
		
		int a=123;
		int sum=0;
		 int checkSum(int b)
		{
		while(b>0)
		{
			  b=b%10;
			  sum=sum+b;
		}
		if(sum%2==0)
		{
			return -1;
		}
		else
		{
			return 1;
		}
		

	}

}
