import java.util.function.*;
class Student
{
	String name;
	String htno;
	public Student(String name, String htno) {
		super();
		this.name = name;
		this.htno = htno;
	}
	/*@Override
	public String toString() {
		return "Student [name=" + name + ", htno=" + htno + "]";
	}*/
	
	
}
public class Bip {

	public static void main(String[] args) {
		BiFunction<String,String,Student>s=(name,htno)->new Student(name,htno);
		Student s1=s.apply("hari", "101");
		System.out.println(s1.name+s1.htno);
		BiConsumer<String,String>b=(s2,s3)->System.out.println(s2+s3);
		b.accept("hari","kiran");
		System.out.println(b);

	}

}
