package chapter2;
import java.util.*;

public class c2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		var x = scanner.nextInt();
		var y = scanner.nextInt();
		
		if((100 < x) && (x < 200) && (y < 200) && (y > 100)) {
			System.out.println("(" + x + "," + y +")�� �簢�� �ȿ� �ֽ��ϴ�.");
		}
		else
			System.out.println("�簢�� �ȿ� �������� �ʴ� ��ǥ�Դϴ�.");
		
		scanner.close();
	}

}
