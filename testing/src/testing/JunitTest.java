package testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitTest {
       
	 @Test
	  public void test1()
	  {
		  System.out.println("test1");
	  }
	/*@ParameterizedTest
	@ValueSource(strings= {"hari","Dubey"})
	public void test1(String s)
	{
		System.out.println(s);
	}
	@Disabled
	@RepeatedTest(3)
	public void test2()
	{
		System.out.println("test2");
	}
	@BeforeEach
	public void pre()
	{
		System.out.println("before test");
	}
	@AfterEach
	public void post()
	{
		System.out.println("after test");
	}
	@BeforeAll
	public static void preClass()
	{
		System.out.println("before class begins");
	}
	@AfterAll
	public static void postClass()
	{
		System.out.println("after class");
	}*/
	
}
