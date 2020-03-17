package springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
		EmployeeDao dao=(EmployeeDao)ctx.getBean("emp");
		Employees emp=new Employees();
		/*emp.setCompany("harikiran");
		int status=dao.UpdateEmployee(emp);
		if(status!=0)
		{
			System.out.println("updation sucess");
		}*/
		emp.setDept("ece");
		emp.setDesg("assistan");
		emp.setEmail("raghu@gmail");
		emp.setMobile("90668");
		emp.setName("ravi");
		
	}

}
