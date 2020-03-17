package main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.studentDaoImpl;
import data.student;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		studentDaoImpl sdao=(studentDaoImpl)ctx.getBean("edao");
		/*System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter age");
		int age=sc.nextInt();
		
		sdao.create(s);
		sdao.delete(88);*/
		student s=new student();
		s.setId(91);
		s.setName("shivam");
		s.setAge(20);
		Boolean b=sdao.saveStudentByPst(s);
		System.out.println(b);
		
		List<student> students=sdao.listStudents();
		for(student s1:students)
		{
			System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge());
		}

	}

}
