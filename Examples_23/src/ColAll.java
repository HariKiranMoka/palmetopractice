import java.util.*;
public class ColAll {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(20);
		li.add(10);
		li.add(30);
		li.add(40);
		li.add(50);
		li.stream().sorted().forEach(System.out::println);
		//System.out.println(li);
		Set<String> se=new TreeSet<String>();
		se.add("hari");
		se.add("kiran");
		se.add("is");
		se.add("good guy");
		//System.out.println(se);
		PriorityQueue<Integer> d=new PriorityQueue<Integer>();
		d.add(12);
		d.add(13);
		d.add(11);
		d.add(9);
		//System.out.println(d);
		Map<Integer,Collection> m=new HashMap<Integer,Collection>();
		m.put(1,li);
		m.put(2,se);
		m.put(3,d);
		Set s=m.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry m1=(Map.Entry)i.next();
			Collection c=(Collection)m1.getValue();
			System.out.println(m1.getKey()+" "+c);
			
		}
		
		

	}

}
