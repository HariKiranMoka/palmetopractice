package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit4Examples.JunitTest1;

@RunWith(Suite.class)
@Suite.SuiteClasses({JunitTest.class,JunitTest1.class})
public class JunitTestSuit {

}
