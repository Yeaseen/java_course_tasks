package demo;

public class Problem2 {
	
	private static int getSumOfRow(int[][]  arrayIn, int row) {
		
		int sum =0;
		for (int i =0; i<arrayIn[row].length; i++) {
			sum+=arrayIn[row][i];
		}
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		
		int array[][] = { {10, 45}, {2, 42, 67, 5}, { 3, 21}};
		
		System.out.println( getSumOfRow(array,1) );
		

	}
}
