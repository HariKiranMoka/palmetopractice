package usecase1;

public class employee {
    long employeeId;
    String employeeName;
    String employeeAdress;
    long employeePhone;
    double basicSalary;
    double specialAllowance=250.80;
    double Hra=1000.50;
    double transportAllowance=0;
    employee(long Id,String Name,String adress,long phone)
    {
    	employeeId=Id;
    	employeeName=Name;
    	employeeAdress=adress;
    	employeePhone=phone;
    }
    void calculateSalary()
    {
    	double salary;
    	salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
    	System.out.println(employeeName+salary);
    }
    void calculateTransportAllowance()
    {
    	System.out.println(basicSalary);
    	transportAllowance=0.10*basicSalary;
    	System.out.println("trainee transport "+transportAllowance);
    }
}
class Manager extends employee
{ double trp;
	Manager(long Id,String Name,String adress,long phone,double salary)
    {
		super(Id,Name,adress,phone);
    	employeeId=Id;
    	employeeName=Name;
    	employeeAdress=adress;
    	employeePhone=phone;
    	basicSalary=salary;
    }
	 void calculateTransportAllowance()
	    {  
		 System.out.println(basicSalary);
	    	trp= 0.15*basicSalary;
	    	 System.out.println("Manager Transport Allowance: "+trp);
	    }
}
class Trainee extends employee
{
	Trainee(long Id,String Name,String adress,long phone,double salary)
    {
		super(Id,Name,adress,phone);
    	employeeId=Id;
    	employeeName=Name;
    	employeeAdress=adress;
    	employeePhone=phone;
    	basicSalary=salary;
    }
}
