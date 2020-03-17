package examples_20;
import java.util.ArrayList;
import java.util.function.*;
class Student
{
	String name;
	int marks;
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}

public class Test {

	public static void main(String[] args) {
		Student s1=new Student("hari",80);
		Student s2=new Student("kiran",60);
		Student s3=new Student("shivam",90);
		Student s4=new Student("surya",50);
		Student s5=new Student("ram",55);
        ArrayList<Student> list=new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        Predicate<Student>p=s->s.marks>=40;
        Function<Student,String>f=s->
        {
        	int marks=s.marks;
        	if(marks>=80)
        	 return"A[Distinction]";
        	else if(marks>=70)
        		return "B[Firstclass]";
        	else if(marks>=40)
        		return "C[secondclass]";
        	else
        		return "failed";
        	
        };
        Consumer<Student>c=s->
        {
        	System.out.println(s.name);
        	System.out.println(s.marks);
        	System.out.println(f.apply(s));
        };
        for(Student s : list)
        {
        	if(p.test(s))
        		c.accept(s);
        		
        }
	}

}
