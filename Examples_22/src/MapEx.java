import java.util.*;
class St implements Comparable<St>
{
	String name;
	int m1,m2;
	public St(String name, int m1, int m2) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
	}
	@Override
	public int compareTo(St arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "St [name=" + name + ", m1=" + m1 + ", m2=" + m2 + "]";
	}
}
public class MapEx {

	public static void main(String[] args) {
		
 		Map<Integer,St> hm=new HashMap();
		hm.put(1001,new St("hari",48,40));
		hm.put(1002,new St("kiran",60,50));
		hm.put(1001,new St("ram",70,45));
		hm.put(1001,new St("krish",60,30));
		hm.put(1001,new St("shivam",50,35));
		Set s=hm.entrySet();
		Iterator r=s.iterator();
		while(r.hasNext())
		{
			
		}
		

	}

}
