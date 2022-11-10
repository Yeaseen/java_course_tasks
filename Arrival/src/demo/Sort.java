package demo;

import java.util.Arrays;


public class Sort {
	
	 public static void findMaximumProduct(int[] A)
	    {
	       
	        int n = A.length;
	       
	        if (n < 2) {
	            return;
	        }
	   
	        Arrays.sort(A);
	  
	       
	        if ((A[0] * A[1]) > (A[n - 1] * A[n - 2])) {
	            System.out.print("Pair is (" + A[0] + ',' + A[1] + ')');
	        }
	        else {
	            System.out.print("Pair is (" + A[n - 1] + ',' + A[n - 2] + ')');
	        }
	    }

	public static void main(String[] args) {
		
		int[] arr = { 5, -27, 2, 7, 87, -42, 5 };
		
//        System.out.println("The original array is: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        Arrays.sort(arr);
//        
//        System.out.println("\nThe sorted array is: ");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
        
          
		findMaximumProduct(arr);
        
        
	}

}

