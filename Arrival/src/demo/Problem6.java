package demo;

public class Problem6 {
	
	private static boolean diagonalEqualsRow(int[][]  arrayIn, int rowIn) {
		
		int row = arrayIn.length;
		int column = arrayIn[0].length;
		
		if( row != column ) {
			throw new IllegalArgumentException("Not a sqaure Matrix");
		}
		else if( rowIn >= row ) {
			throw new IllegalArgumentException("Row out of Bound Error");
		}
		
		
		int diagonalSum=0;
		int rowInSum=0;
		for (int i =0; i<row; i++) {
			for(int j=0; j<column; j++) {
				if(i==j) diagonalSum+=arrayIn[i][j];
				if(i==rowIn) rowInSum+=arrayIn[i][j];
			}
			
		}
		
		return diagonalSum==rowInSum;
		
	}

	public static void main(String[] args) {
		
		//int array[][] = { {10, 45, 67}, {2, 42, 67}, { 1, 3, 21}, {1, 2, 3}};
		//System.out.println(diagonalEqualsRow(array, 0));
		
		//int array[][] = { {10, 45, 67}, {2, 42, 67}, { 1, 3, 21}};
		//System.out.println(diagonalEqualsRow(array, 3));
		
		//int array[][] = { {10, 45, 67}, {2, 42, 67}, { 1, 3, 21}};
		//System.out.println(diagonalEqualsRow(array, 0));
		
		int array[][] = { {1,3,3,2}, {4,2,5,6}, { 1,2,3,4}, {7,8,9,4}};
		System.out.println(diagonalEqualsRow(array, 2));

	}

}
