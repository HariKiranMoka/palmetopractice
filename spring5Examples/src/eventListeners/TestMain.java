package eventListeners;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		/*ClassPathXmlApplicationContext cont=new ClassPathXmlApplicationContext("applicationContext.xml");
		FootBallCoach tch=cont.getBean(FootBallCoach.class);
		System.out.println(tch.getDailyWorkOut());
		System.out.println(tch.getMessage());*/
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		context.start();
		Helloworld h=(Helloworld)context.getBean("hello");
		h.getme();
		context.close();

	}

}
