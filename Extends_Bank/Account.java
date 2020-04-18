package javaTest.bank;

public class Account {
	private String acnumber;
	private String user;
	private int money;
	
	public String getAcnumber() {
		return acnumber;
	}
	public void setAcnumber(String acnumber) {
		this.acnumber = acnumber;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public Account(String acnumber, String user, int money) {
		super();
		this.acnumber = acnumber;
		this.user = user;
		this.money = money;
	}
	
}
