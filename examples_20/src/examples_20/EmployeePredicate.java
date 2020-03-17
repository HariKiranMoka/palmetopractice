package examples_20;
import java.util.function.Predicate;
import java.util.ArrayList;
 class Employee {
	String name;
	String des;
	String city;
	Float sal;
	Employee(String name,String des,String city,float sal)
	{
		this.name=name;
		this.des=des;
		this.city=city;
		this.sal=sal;
	}
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;
		if(name.equals(e.name)&&des.equals(e.des)&&city.equals(e.city)&&sal.equals(e.sal))
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", des=" + des + ", city=" + city + ", sal=" + sal + "]";
	}
	
}
public class EmployeePredicate
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("hari","ceo","hyderabad",30000f);
		Employee e2=new Employee("kiran","manager","hyderabad",15000f);
		Employee e3=new Employee("shivam","owner","pun",3000000f);
		Employee e4=new Employee("sing","developer","chn",1000f);
		Employee e5=new Employee("ram","lead","afr",300f);
		Predicate<Employee> p1=emp->emp.des.equals("owner");
		Predicate<Employee> p2=emp->emp.city.equals("hyderabad");
		Predicate<Employee> p3=emp->emp.sal>16000f;
		System.out.println(p1.test(e2));
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		display(p2.and(p3),list);
		display(p1,list);
	}
	    public static void display(Predicate<Employee> p,ArrayList<Employee> list)
		{
			for(Employee e:list)
			{
				if(p.test(e))
				{
					System.out.println(e);
				}
			}
		}		
	
}

