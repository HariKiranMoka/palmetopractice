package practice_ex;

public class UserMainCode {
	public static String getMiddle(String s,int n)
	{
		StringBuilder sb=new StringBuilder();
		
			sb.append(s.substring(0,n));
			sb.append(s.substring(s.length()-n,s.length()));
		
		return sb.toString();
	}

}
