package examples_20;
import java.util.function.Predicate;
class User
{
	String uid;
	String pwd;
	public User(String uid,String pwd)
	{
		this.uid=uid;
		this.pwd=pwd;
		//System.out.println(this.uid+this.pwd);
	}
}
public class UserId {

	public static void main(String[] args) {
		User u1=new User("admin","1234");
		User u2=new User("praven","12");
		
		Predicate<User> tuser=u->
		{
			if(u.uid.equals("admin")&& u.pwd.equals("1234"))
			return true;
			else
			return false;
			
		};
		
		 
			if(tuser.test(u1))
				System.out.println("valid");
			else
		
		System.out.println("invalid");
		

	}

}
