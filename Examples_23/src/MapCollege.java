import java.util.*;
class Cgroups
{
	
	String g1;
	String g2;
	String g3;
	public Cgroups( String g1, String g2, String g3) {
		super();
	
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
	}
	
	
	
}
public class MapCollege {

	public static void main(String[] args) {
		Map<String,Cgroups> m=new HashMap<String,Cgroups>();
		m.put("JNTU", new Cgroups("cse","it","mech"));
		m.put("SVU", new Cgroups("ece","eie","ase"));
		m.put("OU", new Cgroups("cse","it","eee"));
	    System.out.println("enter course");
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
		Set s=m.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			Cgroups c=(Cgroups)me.getValue();
			if(c.g1.equals(s1)||c.g2.equals(s1)||c.g3.equals(s1))
			{
				System.out.println(me.getKey());
			}
		}

	}

}
