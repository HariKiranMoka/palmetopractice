package addition;

public class UserMainCode1 {
      public static String findRoots(int a,int b,int c)
      {
    	     int d=((b*b)-(4*a*c));
    	     if(d>0)
    	    	 return "roots are real and unequal";
    	     else if(d<0)
    	         return "roots are imaginary";
    	     else
    	    	 return "roots are real and equal";
    	          
      }
}
