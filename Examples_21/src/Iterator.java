import java.util.*;
public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ArrayList ar=new ArrayList();
          ar.add("java");
          ar.add("Dotnet");
          ar.add("selenium");
          //Iterator ir=new ar.iterator();
          ar.forEach(System.out::println);
	}

}
