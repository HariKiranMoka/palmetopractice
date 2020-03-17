package springExamples;

public class Humans {
	String name;
	int age;
	Address adr;
	public Humans(String name, int age, Address adr) {
		super();
		this.name = name;
		this.age = age;
		this.adr = adr;
	}
	public void display()
	{
		System.out.println(name+age+adr);
	}

}
