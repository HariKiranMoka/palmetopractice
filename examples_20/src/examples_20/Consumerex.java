package examples_20;
import java.util.function.Consumer;
public class Consumerex {

	public static void main(String[] args) {
		Consumer<String>c=s->System.out.println(s);
		c.accept("hello");

	}

}
