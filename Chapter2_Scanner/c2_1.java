package chapter2;

import java.util.Scanner;

public class c2_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		var won = scanner.nextInt();
		var dal = (won/1100);
		
		System.out.println(won + "���� $"+ (double)dal + "�Դϴ�.");
		scanner.close();
	}

}
