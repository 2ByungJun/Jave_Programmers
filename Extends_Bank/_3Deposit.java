package javaTest.bank;

import java.util.*;

public class _3Deposit extends Checking_acnumber {

	public _3Deposit(ArrayList<Account> account, String acnumber, String user, int money) {
		super(acnumber, user, money);
		// TODO Auto-generated constructor stub

		System.out.println("----------------");
		System.out.println("     3. 입금           ");
		System.out.println("----------------");
		int ideposit = 0;
		int index = AccountIndex(account, InputAccount());

		if (index != (-1)) {
			System.out.print("\n입금액 : ");
			ideposit = scanner.nextInt();
			ideposit += account.get(index).getMoney();
			account.get(index).setMoney(ideposit);
		} else
			System.out.println("존재하지 않는 계좌입니다.");

	}
}
