
public class c3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray [] = new int[10];
		int sum = 0;
		
		System.out.print("·£´ýÇÑ Á¤¼öµé :");
		for(int k : intArray) {
			k = (int)(Math.random()*10 + 1);
			System.out.print(" " + k);
			sum += k;
		}
		System.out.println();
		System.out.println("Æò±ÕÀº " + (double)(sum/intArray.length));
	}
}
