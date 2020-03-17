package springExamples;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 // ApplicationContext factory=new	ClassPathXmlApplicationContext("d://beans.xml");
		//ClassPathResource cps=new ClassPathResource("beans.xml");
		//XmlBeanFactory factory=new XmlBeanFactory(cps);
		//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans1.xml");
		/*Person p=(Person)ctx.getBean("person");
		p.setAge(15);
		p.setName("kiran");
		Person p1=(Person)ctx.getBean("person");
		p1.setAge(1);
		p1.setName("hari");
		Helloworld obj=(Helloworld)ctx.getBean("helloworld");
		
		p.Display();
		p1.Display();
		//p.Display();*/
		Humans h=(Humans)ctx.getBean("Humans");
		h.display();
		

	}

}
