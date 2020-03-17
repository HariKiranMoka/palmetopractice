package usecase1;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);  
		m.calculateSalary();		
        Trainee t=new Trainee(29846,"jack","Mumbai India",442085,45000);
        t.calculateSalary();
        m.calculateTransportAllowance();
        t.calculateTransportAllowance();


	}

}
