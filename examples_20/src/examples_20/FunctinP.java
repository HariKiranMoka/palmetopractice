package examples_20;
import java.util.function.Function;
public class FunctinP {

	public static void main(String[] args) {
		Function<String,Integer>f=s->
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				 count++;
			}
			return count;
		};
		System.out.println(f.apply("suryaie"));
		Function<String,Integer>f1=s1->
		{
			int count=0;
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==' ')
					count++;
			}
			return s1.length()-count;
		};
		System.out.println(f1.apply("shivam    singh"));

	}

}
