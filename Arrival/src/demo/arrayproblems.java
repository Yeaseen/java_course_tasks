package demo;


public class arrayproblems {
	
	static void Sum_of_Diagonals1(int[][] matrix)
    {
		
		matrix[0][0] = 888;
        
//		int N = matrix[0].length;
//		// Declaring and initializing two variables to zero initially for primary and secondary diagonal count
//        int Pd = 0, Sd = 0;
//   
//        // Two Nested for loops for iteration over a matrix
//        // Outer loop for rows
//        for (int k = 0; k < N; k++) {
//   
//            // Inner loop for columns
//            for (int l = 0; l < N; l++) {
//   
//                // Condition for the principal
//                // diagonal
//                if (k == l)
//                    Pd = Pd + matrix[k][l];
//   
//                // Condition for the secondary diagonal
//                if ((k + l) == (N - 1))
//                    Sd = Sd + matrix[k][l];
//            }
//        }
//   
//        // Print and display the sum of primary diagonal
//        System.out.println("Sum of Principal Diagonal:"
//                           + Pd);
//        // Print and display the sum of secondary diagonal
//        System.out.println("Sum of Secondary Diagonal:"
//                           + Sd);
    }
 
	static void change(int d) {
		//the value of d is 100
		d=800;
	}
   
    // Main driver method
    static public void main(String[] args)
    {
 
        // Input integer array
        // Custom entries in an array
    	
    	
        
    	int[][] b = { 
    				  { 8, 2, 13, 4 },
                      { 9, 16, 17, 8 },
                      { 1, 22, 3, 14 },
                      { 15, 6, 17, 8 } 
                      
    	            };
    	
    	
    	int p =100;
    	System.out.println(p); // p=100
    	
    	change(p);
   
    	System.out.println(p); // p=100
    	
    	
    
    	System.out.println(b[0][0]); //b[0][0] = 8
    	
    	Sum_of_Diagonals1(b);
    	
    	
    	System.out.println(b[0][0]); //b[0][0] = 888
    }

}
