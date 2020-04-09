package chapter2;
import java.util.*;

public class c2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		var X = scanner.nextDouble();
		var Y = scanner.nextDouble();
		var r = scanner.nextDouble();
		
		System.out.print("점 입력>>");
		var x = scanner.nextDouble();
		var y = scanner.nextDouble();
		
		if((x<(X+r) && x>(X-r)) && (y<(Y+r) && y>(Y-r))) {
			System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
		}
		
		
		scanner.close();
	}

}
