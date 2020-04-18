package javaTest.bank;

import java.util.*;

public class _5ChangeName extends Checking_acnumber{

	public _5ChangeName(ArrayList<Account> account,String acnumber, String user, int money) {
		super(acnumber, user, money);
		// TODO Auto-generated constructor stub
		
		int iaccount = 0;
	    String sname = "";

	    System.out.println("----------------");
	    System.out.println("   5. 이름 수정         ");
	    System.out.println("----------------");

	    iaccount = AccountIndex(account, InputAccount());
	    if (iaccount != (-1)) {
	      System.out.print("변경할 이름 입력>> ");
	      sname = scanner.next();
	      account.get(iaccount).setUser(sname);
	      System.out.println("이름이 변경되었습니다.");
	    } else
	      System.out.println("존재하지 않는 계좌입니다.");
	}
}
