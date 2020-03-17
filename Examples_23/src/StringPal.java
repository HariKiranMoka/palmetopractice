import java.util.Scanner;
public class StringPal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.next();
        char[] a=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        int flag=0;
        while(i<j)
        {
        	if(a[i]==a[j])
        	{
        		
        		i++;
        	    j--;
        	    flag=0;
        	}
        	else
        	{
        		flag=1;
        		break;
        	}
        }
        if(flag==0)
        {
        	System.out.println("palindrome");
        }
        	
        else
        {
        	System.out.println("not");
        }
	}

}
