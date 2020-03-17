package dto;

public class Accounts {
      String acno;
      String name;
      String acttype;
      float balance;
	public Accounts(String acno, String name, String acttype, float balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.acttype = acttype;
		this.balance = balance;
	}
	public String getAcno() {
		return acno;
	}
	public void setAcno(String acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActtype() {
		return acttype;
	}
	public void setActtype(String acttype) {
		this.acttype = acttype;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accounts [acno=" + acno + ", name=" + name + ", acttype=" + acttype + ", balance=" + balance + "]";
	}
      
}
