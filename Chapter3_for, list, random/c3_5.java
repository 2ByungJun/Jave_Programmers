import java.util.Scanner;

public class c3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		int intArray[] = new int[10];
		for(int i=0; i<intArray.length; i++)
			intArray[i] = scanner.nextInt();
		
		System.out.print("3�� ����� ");
		for(int k : intArray) {
			if(k%3 == 0) {
				System.out.print(k + " ");
			}
		}
		
		scanner.close();

	}

}
