import java.util.*;
/* class Employee
 {
	 
	 String name;
	public Employee( String name) {
		super();
		
		this.name = name;
	}
	 
 }*/
 public class EmployeeMap {

	public static void main(String[] args) {
		
         Map<Integer,Integer> m=new HashMap<Integer,Integer>();
         ArrayList<Integer> l=new ArrayList<Integer>();
         System.out.println("enter the n values");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
          m.put(sc.nextInt(), sc.nextInt());
         int max=0;
         int y=0;
         int temp=0;
         Set s=m.entrySet();
         Iterator i=s.iterator();
         while(i.hasNext())
         {
        	 Map.Entry entry=(Map.Entry)i.next();
        	 temp=(Integer)entry.getValue();
        	 if(temp>max)
        		 max=temp;
        	     y=(Integer)entry.getKey();
        	 
        		 
         }
         System.out.println(y+"  "+max);
         
	}

}
