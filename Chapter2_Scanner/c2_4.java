package chapter2;
import java.util.*;

public class c2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		var num1 = scanner.nextInt();
		var num2 = scanner.nextInt();
		var num3 = scanner.nextInt();
		
		var senter_value = num1;
		// 조건
		if( num1 < num2 ) {
			if( num1 < num3 ) {
				if( num3 < num2) {
					senter_value = num3;
				}
				else
					senter_value = num2;
			}
			else
				senter_value = num1;
		}
		else {
			if( num2 < num3 ) {
				if( num3 < num1) {
					senter_value = num3;
				}
				else
					senter_value = num1;
			}
			else
				senter_value = num2;
		}
		System.out.println("중간 값은 " + senter_value );
		
		scanner.close();

	}

}
