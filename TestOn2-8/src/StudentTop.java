import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentTop {

	public static void main(String[] args) {
		Student s1=new Student(81,"divya");
		Student s2=new Student(65,"kiran");
		Student s3=new Student(55,"surya");
		Student s4=new Student(50,"anil");
		Student s5=new Student(40,"hari");
		ArrayList<Student>li=new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		Predicate<Student> p=(s)->s.marks>=50;
		Function<Student,String>f=(s)->
		{
			if(s.marks>=80)
			{
				return "Distinction";
			}
			else if(s.marks>=60&&s.marks<=79)
				return "first Classs";
			else if(s.marks>=50&&s.marks<=60)
				return "second Classs";
			else
			    return "fail";
		};
		Consumer<Student>c=(s)->
		{
			System.out.print(s.name+" ");
			System.out.print(s.marks+" ");
			System.out.println(f.apply(s));
			
		};
		for(Student s : li)
		{
			if(p.test(s))
			{
				c.accept(s);
			}
		}
		
		
		
		
	}

}
