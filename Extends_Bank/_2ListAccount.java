package javaTest.bank;

import java.util.*;

public class _2ListAccount extends Account{

	public _2ListAccount(ArrayList<Account> account,String acnumber, String user, int money) {
		super(acnumber, user, money);
		// TODO Auto-generated constructor stub
		
		System.out.println("----------------");
		System.out.println("   2. 계좌 목록          ");
		System.out.println("----------------");
		System.out.println("이름\t계좌번호\t\t총액");
		if (account.size() == 0)
			System.out.println("입력되어 있는 정보가 없습니다.");
		else {
			for (int i = 0; i < account.size(); i++) {
				System.out.println((account.get(i)).getUser() + "\t"
						+ (account.get(i)).getAcnumber() + "\t\t"
						+ (account.get(i)).getMoney());
			}
		}
	}
}
