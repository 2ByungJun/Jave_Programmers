package javaTest.bank;

import java.util.ArrayList;

public class _6RemoveAccount extends Checking_acnumber{

	public _6RemoveAccount(ArrayList<Account> account,String acnumber, String user, int money) {
		super(acnumber, user, money);
		// TODO Auto-generated constructor stub
		
		int iaccount = 0;
	    System.out.println("----------------");
	    System.out.println("   6. 계좌 삭제         ");
	    System.out.println("----------------");
	    iaccount = AccountIndex(account, InputAccount());
	    if (iaccount != (-1)) {
	      account.remove(iaccount);
	    } else
	      System.out.println("존재하지 않는 계좌입니다.");
	}
}
