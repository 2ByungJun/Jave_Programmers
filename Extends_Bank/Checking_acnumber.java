package javaTest.bank;

import java.util.*;

public class Checking_acnumber extends Account{

	Scanner scanner = new Scanner(System.in);
	
	public Checking_acnumber(String acnumber, String user, int money) {
		super(acnumber, user, money);
		// TODO Auto-generated constructor stub	
	}
	
	// 계좌 입력 받는 곳
	public String InputAccount() { 
	    String saccount = "";
	    System.out.print("계좌 입력>> ");
	    saccount = scanner.next();
	    return saccount;
	}
	
	// 계좌번호 입력 받고 그 계좌가 존재하는 인덱스 번호 추출
	public int AccountIndex(ArrayList<Account> account, String acnumber) {
		int index = -1;

		Iterator<Account> itr = account.iterator();
		Account accountInfo;

		while (itr.hasNext()) {
			accountInfo = itr.next();// iterator를 활용해 모든 값 가져오기
			if (accountInfo.getAcnumber().equals(acnumber)) {
				index = account.indexOf(accountInfo);
				break;
			}
		}
		return index;
	}
	
}
