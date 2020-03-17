package examples_20;
import java.util.function.Predicate;
public class P {
    public static void main(String args[])
    {
    	Predicate<Integer> p=i->{
    	
    		boolean flag=true;
    		for(int x=2;x<i;x++)
    		{
    			if(i%2==0)
    				flag=false;
    			    break;
    		}
    		return flag;
    	};
    	 String[] names= {"hari","shivam","kiran"};
    	 System.out.println(p.test(13));
    	 Predicate<String> p1=s-> (s.charAt(0)=='k');
    	 for(String n:names) {
    		 if(p1.test(n))
    			 System.out.println(n);
    	 }
    	 System.out.println(p1.test("hari"));
    }
}
   