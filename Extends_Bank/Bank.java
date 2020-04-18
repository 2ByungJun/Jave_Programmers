package javaTest.bank;

import java.util.*;

public class Bank {
	private ArrayList<Account> account = new ArrayList<Account>();
	Scanner scanner = new Scanner(System.in);
	
	  public void Menu() { // 메뉴 출력
		    int isel = 0;
		    System.out.println("+--------------------------------------------------------------+");
		    System.out.println("1.계좌생성 | 2.계좌목록 | 3.입금 | 4.출금 | 5.이름 수정 | 6.계좌 삭제 | 7.종료");
		    System.out.println("+--------------------------------------------------------------+");
		    System.out.print("실행>> ");
		    isel = scanner.nextInt();
		    SelMenu(isel);
		  }
	  
	  public void SelMenu(int isel) { // 메뉴 선택
		    switch (isel) {
		      case 1: // 계좌 생성
		    	  _1CreateAccount _1 = new _1CreateAccount("", "", 0);
		    	  account.add(_1);
		        break;
		      case 2: // 계좌 목록
		    	  _2ListAccount _2 = new _2ListAccount(account,"","",0);
		        break;
		      case 3: // 예금
		    	  _3Deposit _3 = new _3Deposit(account,"","",0);
		        break;
		      case 4: // 출금
		          _4Withdrawal _4 = new _4Withdrawal(account,"","",0);
		        break;
		      case 5: // 이름 수정
		    	  _5ChangeName _5 = new _5ChangeName(account,"","",0);
		        break;
		      case 6: // 계좌 삭제
		    	  _6RemoveAccount _6 = new _6RemoveAccount(account,"","",0);
		        break;
		      case 7: // 종료
		        System.out.println("----------------");
		        System.out.println("시스템이 종료되었습니다.");
		        System.out.println("----------------");
		        System.exit(0);
		        break;
		    }
	  }
}
