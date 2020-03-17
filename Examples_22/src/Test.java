import java.util.function.*;
import java.util.*;
class emp
{
	String name;
	double salary;
	public emp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class Test {

	public static void main(String[] args) {
		ArrayList<emp> l=new ArrayList();
		l.add(new emp("Hari",1000));
		l.add(new emp("kiran",2000));
		l.add(new emp("shivam",3000));
		l.add(new emp("surya",4000));
		BiConsumer<emp,Double>c=(e,d)->e.salary=e.salary+d;
		for(emp e :l)
		{
			c.accept(e,500.0);
		}
		for(emp e:l)
		{
			System.out.println("employe name:"+e.name+" "+"salary="+e.salary);
		}
		
	}

}
