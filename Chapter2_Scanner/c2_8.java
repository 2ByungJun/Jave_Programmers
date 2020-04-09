package chapter2;
import java.util.*;

public class c2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
		var x1 = scanner.nextInt();
		var y1 = scanner.nextInt();
		
		System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
		var x2 = scanner.nextInt();
		var y2 = scanner.nextInt();
		
		if(inRect(x1,y1,100,100,200,200) == true || inRect(x2,y2,100,100,200,200)) {
			System.out.println("해당 좌표로 이루어진 직사각형은 충돌한다.");
		}
		else
			System.out.println("충돌하지 않는다.");

		scanner.close();

	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) {
			return true;
		}
		else return false;
	}

}
