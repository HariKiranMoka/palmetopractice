package practiceExceptions;
import java.util.Scanner;
import java.lang.*;
public class Division
{
    int num1,num2;
    public String divideTwoNumbers(int n1,int n2)throws ArithmeticException
    {
        if(n2!=0)
        {
            return "The answer is"+(n1/n2);
        }
        else
        {
            return "Division by zero is not possible";
        }
       
    }
    public static void main(String[] args)
    {
        Division d=new Division();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        try {
             
              String s=d.divideTwoNumbers(n1,n2);
              System.out.print(s);
            }
        
        catch(ArithmeticException e) 
        {
           System.out.print("Division by zero is not possible");
        } 
        finally
        {
            System.out.println(".Thanks for using the application");
        }
    }
}

