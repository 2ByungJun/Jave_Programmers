package chapter2;
import java.util.*;

public class c2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է��Ͻÿ�>>");
		var num1 = scanner.nextInt();
		var num2 = scanner.nextInt();
		var num3 = scanner.nextInt();
		
		if((num1+num2>num3) && (num1+num3>num2) && (num2+num3>num1)) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		else
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		
		scanner.close();
	}

}
