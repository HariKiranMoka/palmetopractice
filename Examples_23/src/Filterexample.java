import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.function.Function;
public class Filterexample {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Function<Integer,Integer> f=x->x*2;
		ar.add(0);
		ar.add(15);
		ar.add(12);
		ar.add(20);
		ar.add(2);
		ar.stream().map(x->x%2).forEach(System.out::println); 
		//ar.stream().map(x->x*3).collect(Collectors.)

		//ar.stream().filter(x->x%2==0).forEach(System.out::println); 
	
	
	}

}
