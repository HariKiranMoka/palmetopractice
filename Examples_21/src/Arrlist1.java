import java.util.ArrayList;
import java.util.Iterator;
class Persons
{
	int id;
	String name;
	public Persons(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Persons [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
public class Arrlist1 {

	public static void main(String[] args) {
		ArrayList colors=new ArrayList();
		colors.add("blue");
		colors.add("green");
		colors.add("blue");
		colors.add("Red");
		Iterator i=colors.iterator();
		while(i.hasNext())
		System.out.println(i.next());
		colors.add(2,"orange");
		System.out.println(colors);
		System.out.println(colors.get(2));
		colors.set(4,"lightblue");
		System.out.println(colors);
		colors.remove(4);
		System.out.println(colors);
		/*ArrayList list=new ArrayList();
		//System.out.println(colors);
		Persons p1=new Persons(123,"hari");
		Persons p2=new Persons(345,"kiran");
		list.add(p1);
		list.add(p2);
		System.out.println(list);*/
		
		
		
	}

}
