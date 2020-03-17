package testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result rs=JUnitCore.runClasses(JunitTestSuit.class);
         for(Failure f:rs.getFailures())
         {
        	 System.out.println(f.toString());
         }
         System.out.println(rs.wasSuccessful());
	} 

}
