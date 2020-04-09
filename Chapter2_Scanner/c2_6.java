package chapter2;
import java.util.*;

public class c2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 »çÀÌÀÇ Á¤¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À>>");
		var num = scanner.nextInt();
		
		if((num/10==3) || (num/10==6) || (num/10==9)) {
			System.out.print("¹Ú¼ö Â¦");
			if((num%10==3) || (num%10==6) || (num%10==9))
				System.out.println("Â¦");
		}
		else if((num%10==3) || (num%10==6) || (num%10==9)) {
			System.out.print("¹Ú¼ö Â¦");
			if((num/10==3) || (num/10==6) || (num/10==9))
				System.out.println("Â¦");
		}
		else
			System.out.print(num);
		
		scanner.close();
	}

}
