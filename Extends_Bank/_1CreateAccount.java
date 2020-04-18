package javaTest.bank;

public class _1CreateAccount extends Account{

	public _1CreateAccount(String acnumber, String user, int money) {
		super(acnumber, user, money);
		// TODO Auto-generated constructor stub
		
	    System.out.println("----------------");
	    System.out.println("   1. 계좌 생성          ");
	    System.out.println("----------------");

	    System.out.print("이름 : ");
	    setUser("이병준");
	    System.out.println(getUser());

	    System.out.print("계좌번호 : ");
	    setAcnumber((int) (Math.random() * 999 + 100) + "-" + (int) (Math.random() * 999 + 100));
	    System.out.println(getAcnumber());

	    System.out.print("초기 입금액 : ");
	    setMoney(20000);
	    System.out.println(getMoney());
	}

}
