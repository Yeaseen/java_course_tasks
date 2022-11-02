package project3;

import java.util.LinkedList;

public class wordList {
	
	public static LinkedList<wordLine> ll = new LinkedList<wordLine>();

	public static void main(String[] args) {
		
		 	ll.add(new wordLine("My",1));
	        ll.add(new wordLine("name",1));
	        ll.add(new wordLine("is",1));
	        ll.add(new wordLine("arafat",1));
	        
	        for (int i = 0; i < ll.size(); i++)
	            System.out.println(ll.get(i).lineNum+" "+ll.get(i).word);

	}

}
