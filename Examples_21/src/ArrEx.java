import java.util.*;
class Student implements Comparable<Student>
{
	String htmo;
	String name;
	Student(String htno,String name )
	{
		this.htmo=htno;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [htmo=" + htmo + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student s)
	{
		if(name.compareTo(s.name)<0)
		return -1;
		else if(name.compareTo(s.name)>0)
		return 1;
		else
			return 0;
	}
	
}
class employee
{
   String id;
   String name;
public employee(String id, String name) {
	
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + "]";
}
   
}
public class ArrEx {

	public static void main(String[] args) {
		Student s1=new Student("123","hari");
		Student s2=new Student("423","shivam");
		Student s3=new Student("423","bcd");
		Student s4=new Student("456","divya");
		employee e1=new employee("11","surya");
		employee e2=new employee("12","surya");
		
		LinkedList ar=new LinkedList();
		
		/*ar.add(e1);
		ar.add(e2);*/
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		Collections.sort(ar);
		
		System.out.println(ar);
		
		//ar.forEach(System.out::println);
		//System.out.println(ar);
		ar.add("java");
		ar.add("selenium");
		ar.add("testing");
		ar.add("Dotnet");
		/*Collections.sort(ar);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);*/
		ArrayList ar2=new ArrayList();
		/*Collections.copy(ar2,ar);
		System.out.println(ar2);*/
		/*System.out.println(ar);*/
		
		ArrayList ar1=new ArrayList();
		ar1.add("datascience");
		ar1.add("python");
		ar1.add("oracle");
		ar1.add("BigData");
		Collections.fill(ar1,"hari");
		//System.out.println(ar1);
		ar.addAll(ar1);
		//System.out.println(ar);
		ar.add(s1);
		//System.out.println(s1);

	}

}
