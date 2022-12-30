package stringproblems;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter an integer even input");
	    
	    
	    
	    while(true) {
	    	
	    	int input = myObj.nextInt();
	    	
	    	System.out.println(input);
	    	
	    	if( input % 2 == 1) {
	    		System.out.println("Opppsss! this an odd number, Please enter an even number");
	    	}
	    	else if(input % 2 == 0) {
	    		System.out.println("YAAAYYY!! It is an even");
	    		break;
	    	}
	    }
	    

	  

	}

}
