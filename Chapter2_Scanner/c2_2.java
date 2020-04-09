package chapter2;
import java.util.*;

public class c2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		var num = scanner.nextInt();
		
		if( (num % 10) == (num / 10)) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		scanner.close();
	}

}
