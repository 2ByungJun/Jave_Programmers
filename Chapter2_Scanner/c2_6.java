package chapter2;
import java.util.*;

public class c2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		var num = scanner.nextInt();
		
		if((num/10==3) || (num/10==6) || (num/10==9)) {
			System.out.print("�ڼ� ¦");
			if((num%10==3) || (num%10==6) || (num%10==9))
				System.out.println("¦");
		}
		else if((num%10==3) || (num%10==6) || (num%10==9)) {
			System.out.print("�ڼ� ¦");
			if((num/10==3) || (num/10==6) || (num/10==9))
				System.out.println("¦");
		}
		else
			System.out.print(num);
		
		scanner.close();
	}

}
