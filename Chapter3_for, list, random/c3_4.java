import java.util.Scanner;

public class c3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		var s = scanner.next();
		char c = s.charAt(0);
		
		for(int i=(int)c; i>96; i--) {
			for(int j=97; j<=i; j++) {
				System.out.print((char)j);
				}
			System.out.println();
		}

		scanner.close();
	}

}
