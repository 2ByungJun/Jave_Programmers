package chapter2;
import java.util.*;

public class c2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�� (x1,y1)�� ��ǥ�� �Է��Ͻÿ�>>");
		var x1 = scanner.nextInt();
		var y1 = scanner.nextInt();
		
		System.out.print("�� (x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		var x2 = scanner.nextInt();
		var y2 = scanner.nextInt();
		
		if(inRect(x1,y1,100,100,200,200) == true || inRect(x2,y2,100,100,200,200)) {
			System.out.println("�ش� ��ǥ�� �̷���� ���簢���� �浹�Ѵ�.");
		}
		else
			System.out.println("�浹���� �ʴ´�.");

		scanner.close();

	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) {
			return true;
		}
		else return false;
	}

}
