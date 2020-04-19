package javaTest.bank;

import java.util.*;

public class _1CreateAccount extends Account{

	public _1CreateAccount(String acnumber, String user, int money) {
		super(acnumber, user, money);
		// TODO Auto-generated constructor stub
		
	    System.out.println("----------------");
	    System.out.println("   1. 계좌 생성          ");
	    System.out.println("----------------");

	    System.out.print("이름 : ");
	    setUser(randomHangulName());
	    System.out.println(getUser());

	    System.out.print("계좌번호 : ");
	    setAcnumber((int) (Math.random() * 899 + 100) + "-" + (int) (Math.random() * 899 + 100));
	    System.out.println(getAcnumber());

	    System.out.print("초기 입금액 : ");
	    setMoney(20000);
	    System.out.println(getMoney());
	}

	public static String randomHangulName() {
	    List<String> 성 = Arrays.asList("김", "이", "박",  "국", "은", "구", "용");
	    List<String> 이름 = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노", "누", "다",
	        "단", "달", "담", "대", "덕", "도", "동", "두",  "학", "개", "롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");
	    Collections.shuffle(성);
	    Collections.shuffle(이름);
	    return 성.get(0) + 이름.get(0) + 이름.get(1);
	  }
}
