import java.util.HashSet;
import java.util.Scanner;

public class c3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �?");
		var num = scan.nextInt();
		
		HashSet<Integer> intArray = new HashSet<>();
		while(intArray.size() < num) {
			intArray.add((int)(Math.random()*99 + 1));
		}
		// ���
		int count = 0;
		for(int k : intArray) {
			System.out.print(k + " ");
			count++;
			if(count%10 == 0) {
				System.out.println();
			}
		}
		
		scan.close();

	}

}
