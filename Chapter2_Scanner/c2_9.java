package chapter2;
import java.util.*;

public class c2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		var X = scanner.nextDouble();
		var Y = scanner.nextDouble();
		var r = scanner.nextDouble();
		
		System.out.print("�� �Է�>>");
		var x = scanner.nextDouble();
		var y = scanner.nextDouble();
		
		if((x<(X+r) && x>(X-r)) && (y<(Y+r) && y>(Y-r))) {
			System.out.println("�� (" + x + ", " + y + ")�� �� �ȿ� �ִ�.");
		}
		
		
		scanner.close();
	}

}
