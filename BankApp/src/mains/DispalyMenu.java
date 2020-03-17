package mains;

import java.sql.SQLException;
import java.util.Scanner;

import dao.AccountDao;
import dao.UsersDao;
import dto.Accounts;
import dto.Users;

public class DispalyMenu {
	public static int existingUser() throws SQLException {
		UsersDao userdao = new UsersDao("jdbc:mysql://localhost:3306/cts","root","root");
		AccountDao da=new AccountDao("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("Bank Customer Application");
		System.out.println("Enter User name");
		String uname = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		Users user = new Users(uname,pwd);
		int status = userdao.checkUsers(user);
		
		
		userdao.disconnect();
		return status;
		
	}
	public static void newUser() throws SQLException {
		UsersDao userdao= new UsersDao("jdbc:mysql://localhost:3306/cts","root","root");
		Scanner sc = new Scanner(System.in);
		System.out.println("you have to register first...");
		System.out.println("Enter username");
		String uname = sc.next();
		System.out.println("Enter password");
		String pwd = sc.next();
		Users user = new Users(uname,pwd);
		System.out.println("Enter AccountNumber");
		String acctNumber = sc.next();
		System.out.println("Enter AccountType");
		String acctType = sc.next();
		System.out.println("Enter Customer Name");
		String custName = sc.next();
		System.out.println("Enter the amount");
		float balance = sc.nextFloat();
		Accounts accounts = new Accounts(acctNumber,acctType,custName,balance);
		UsersDao.createCustomer(accounts, user);
		
	}
	public static void showMenuOptions() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("***************Bank Application ************");
		System.out.println("1.New User...");
		System.out.println("2.Existing User...");
		System.out.println("Enter your choice...");
		int choice= sc.nextInt();
		switch(choice) {
		case 1: newUser();break;
		case 2: int status=existingUser();
		         if(status==1)
		         {
		        	 System.out.println("1.Deposit");
		        	 System.out.println("2.withDraw");
		        	 System.out.println("3.Balance");
		        	 int ch=sc.nextInt();
		        	 switch(ch)
		        	 {
		        	 case 1:System.out.println("Enter Account number");
		        	         String actn=sc.next();
		        	         System.out.println("enter amount to deposit");
		        	         float bal=sc.nextFloat();
		        	         AccountDao.deposit(actn,bal);
		        	         break;
		        	 case 2:System.out.println("enter account number");
		        	         String actn2=sc.next();
		        	         System.out.println("enter amount to withdraw");
		        	         float bal1=sc.nextFloat();
		        	         AccountDao.withdraw(actn2,bal1);
		        	         break;
		        	 case 3:System.out.println("Enter Account number");
		        	         String actn3=sc.next();
		        	         AccountDao.getBalance(actn3);
		        	         break;
		        	 case 4:System.exit(0);
		        	 default:System.out.println("Wrong choice");
		        	         
		        	 }
		         }
		        break;
		default: System.out.println("Wrong Choice...");
		}
		
	}

}

