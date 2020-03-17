package p1;

public class ThreadLam {

	public static void main(String[] args) {
		
       Runnable r=()->
       {
    	   for(int i=0;i<10;i++)
    	   System.out.println(i);
       };
      Thread t=new Thread(r);
      t.start();
      
      Mathematics m=(a,b)-> a+b;
    	  
      
      System.out.println(m.add(10,20));
      
	}

	
	

	
	

}
