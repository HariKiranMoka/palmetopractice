package examples_20;
import java.util.function.Predicate;
public class predicateex {
	public static void m1(Predicate p,int[] x)
	{
		for(int x1:x)
		{
			if(p.test(x1))
				System.out.println(x1);
		}
	}

	public static void main(String[] args) {
		int[] x= {0,5,10,15,20,25,30};
		Predicate<Integer> p1=i->(i>10);
		Predicate<Integer> p2=i->(i%2==0);
		//System.out.println(p1.and(p2).test(29));
		System.out.println("numbers greater than 10");
		m1(p1.negate(), x);
		

	}

}
