package examples_20;
import java.util.function.Function;
public class TestFun {

	public static void main(String[] args) {
           Function<String,String>f=s->s.toUpperCase();
           Function<String,String>f2=s->s.substring(0,3);
           System.out.println(f.apply("praveenkumar"));
           System.out.println(f2.apply("harikiran"));
           System.out.println(f.andThen(f2).apply("harikiran"));
           System.out.println(f.compose(f2).apply("harikiran"));

	}

}
