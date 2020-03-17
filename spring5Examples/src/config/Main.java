package config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
		Mapping qump=(Mapping)cont.getBean("qump");
		qump.showAnswers();
		Employee e=(Employee)cont.getBean("emp");
		e.showDetails();

	}

}
