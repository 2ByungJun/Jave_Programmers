package chapter2;
import java.util.Scanner;

public class c2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		var won = scanner.nextInt();
		
		if( won>50000 ) {
			System.out.println("�������� " + (won/50000) + "��");
			won -= ((won/50000)*50000);
		}
		if( won>10000 ) {
			System.out.println("������ " + (won/10000) + "��");
			won -= ((won/10000)*10000);
		}
		if( won>1000 ) {
			System.out.println("õ���� " + (won/1000) + "��");
			won -= ((won/1000)*1000);
		}
		if( won>100 ) {
			System.out.println("��� " + (won/100) + "��");
			won -= ((won/100)*100);
		}
		if( won>50 ) {
			System.out.println("���ʿ� " + (won/50) + "��");
			won -= ((won/50)*50);
		}
		if( won>10 ) {
			System.out.println("�ʿ� " + (won/10) + "��");
			won -= ((won/10)*10);
		}
		if( won>1 ) {
			System.out.println("�Ͽ� " + (won/1) + "��");
		}
		scanner.close();
	}

}
