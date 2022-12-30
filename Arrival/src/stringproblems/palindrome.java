package stringproblems;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[])
	   {
	      String reverseString="";
	     
	      String inputString = "abbcbb";

	      int length = inputString.length();

	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverseString = reverseString + inputString.charAt(i);

	      
	      
	      if (inputString.equals(reverseString))
	         System.out.println("Input string is a palindrome.");
	      else
	         System.out.println("Input string is not a palindrome.");

	   }
}
