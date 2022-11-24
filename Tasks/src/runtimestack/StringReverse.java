package runtimestack;

public class StringReverse {
	
	
	
	public static void testF(String abc) {
		
		if(abc=="") System.out.println("Hi");
		else System.out.println(abc);
	}
	
	public static String ReverseUsingFL(String abc) {
		
		String rev = "";
	    
		 for(int i = abc.length() - 1; i >= 0; i--) {
		 rev = rev + abc.charAt(i);
		 }
		 
		 return rev;
	}
	
	
	
	public static String Reverse(String abc) {
		
		if(abc=="") return abc;
		
		return Reverse(abc.substring(1)) + abc.charAt(0);
	}
	
	

	
	public static void main(String[] args) {
		
		String testString = "abcdefghij";
		
		// To reverse the string using StringBuffer Class method
		StringBuffer sbr = new StringBuffer(testString);
        sbr.reverse();
        System.out.println(sbr);
		
        // To reverse the string using a for loop
		String revSFL = ReverseUsingFL(testString);
		System.out.println(revSFL);
		
		int length = testString.length();
		System.out.println(length);
		
		testF(testString.substring(2));
		testF(testString.substring(length));
		
		
		// To reverse the string using Recursion
		String revS = Reverse(testString);
		System.out.println(revS);
		
		
		// To reverse some part of a string using Recursion
		System.out.println(testString.substring(2,7));
		String cTOg= Reverse(testString.substring(2,7));
		
		System.out.println( testString.substring(0,2) + cTOg + testString.substring(7,length));
		
		

	}

}
