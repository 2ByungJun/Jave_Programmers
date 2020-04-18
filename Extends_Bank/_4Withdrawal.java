package javaTest.bank;

import java.util.*;

public class _4Withdrawal extends Checking_acnumber {

	public _4Withdrawal(ArrayList<Account> account, String acnumber, String user, int money) {
		super(acnumber, user, money);
		// TODO Auto-generated constructor stub

		System.out.println("----------------");
		System.out.println("     4. 출금           ");
		System.out.println("----------------");
		int ideposit = 0;
		int index = AccountIndex(account, InputAccount());

		if (index != (-1)) {
			System.out.print("\n출금액 : ");
			ideposit = scanner.nextInt();

			if (ideposit > account.get(index).getMoney()) {
				System.out.println("출금하시는 금액이 기존 잔액보다 많습니다!");
			} else {
				ideposit -= account.get(index).getMoney();
				account.get(index).setMoney(ideposit);
			}
		} else
			System.out.println("존재하지 않는 계좌입니다.");
	}
}
