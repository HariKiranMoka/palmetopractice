package linearsearch;

public class UserMainCode {
      public static int sumofSame(int []a,int []b)
      {
    	      int sum=0;
             for(int i=0;i<a.length;i++)
             {
            	 
            	 for(int j=0;j<b.length;j++)
            	 {
            		 //System.out.println("Inside the loop");
            		 if(a[i]==b[j])
            		 {
            			 sum=sum+a[i];
            		 }
            	 }
            	 
             }
             return sum;
    	  
      }
}
