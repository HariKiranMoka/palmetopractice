package addition;

public class UserMainCode {
	public static int  countVowels(String s)
	{
		String s1=s;
		int count=0;
		for(int x=0;x<s.length();x++)
		{
			if(s1.charAt(x)=='a'||s1.charAt(x)=='e'||s1.charAt(x)=='i'||s1.charAt(x)=='o'||s1.charAt(x)=='u')
			{
				count++;
			}
		}
		return count;
	}

}