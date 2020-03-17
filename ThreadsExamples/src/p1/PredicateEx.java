package p1;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		/*Predicate<Integer> p=(a)->a%2==0;
		if(p.test(9))
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}*/
		Function<Integer,Double> f=r->3.14*r*r;
		System.out.println(f.apply(4));
		BiFunction<Integer,Integer,Integer> bigg=(a,b)->
		{
			if(a>b)
			{
				return a;
			}
			else
				return b;
		};
		System.out.println(bigg.apply(3,4));

	}

}
