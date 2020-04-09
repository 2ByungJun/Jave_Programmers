package chapter2;
import java.util.Scanner;

public class c2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		var won = scanner.nextInt();
		
		if( won>50000 ) {
			System.out.println("오만원권 " + (won/50000) + "매");
			won -= ((won/50000)*50000);
		}
		if( won>10000 ) {
			System.out.println("만원권 " + (won/10000) + "매");
			won -= ((won/10000)*10000);
		}
		if( won>1000 ) {
			System.out.println("천원권 " + (won/1000) + "매");
			won -= ((won/1000)*1000);
		}
		if( won>100 ) {
			System.out.println("백원 " + (won/100) + "개");
			won -= ((won/100)*100);
		}
		if( won>50 ) {
			System.out.println("오십원 " + (won/50) + "개");
			won -= ((won/50)*50);
		}
		if( won>10 ) {
			System.out.println("십원 " + (won/10) + "개");
			won -= ((won/10)*10);
		}
		if( won>1 ) {
			System.out.println("일원 " + (won/1) + "개");
		}
		scanner.close();
	}

}
