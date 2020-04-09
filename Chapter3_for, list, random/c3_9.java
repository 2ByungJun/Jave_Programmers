
public class c3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray [][] = new int [4][4];
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (int)(Math.random()*10 + 1);
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
