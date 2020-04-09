package chapter2;
import java.util.*;

public class c2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		var x = scanner.nextInt();
		var y = scanner.nextInt();
		
		if((100 < x) && (x < 200) && (y < 200) && (y > 100)) {
			System.out.println("(" + x + "," + y +")는 사각형 안에 있습니다.");
		}
		else
			System.out.println("사각형 안에 존재하지 않는 좌표입니다.");
		
		scanner.close();
	}

}
