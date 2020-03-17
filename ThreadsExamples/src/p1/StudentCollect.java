package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
class Student implements Comparable<Student>{
	
	String name;
	Integer age;
	String city;
	public Student(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
	@Override
	public int compareTo(Student o) {
		if(age.compareTo(o.age)<0)
			return -1;
		else if(age.compareTo(o.age)>0)
			return 1;
		else
			return 0;
		
	}
	
}
public  class StudentCollect {

	public static void main(String[] args) 
	{
		Student s1=new Student("hari",21,"mog");
		Student s2=new Student("kiran",17,"viz");
		Student s3=new Student("surya",16,"vij");
		Student s4=new Student("ram",18,"hyd");
		TreeMap<Integer,Student>tm=new TreeMap<Integer,Student>();
		tm.put(1,s1);
		tm.put(2,s2);
		tm.put(3,s3);
		tm.put(4,s4);
		System.out.println(tm);
		
		
		
	}	
		
	}


