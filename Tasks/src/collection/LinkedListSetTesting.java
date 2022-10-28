package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedListSetTesting {

	 public static void main(String args[])
	    {
	        // Creating LinkedHashSet and
	        // adding elements
	        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	  
	        lhs.add("Geeks");
	        lhs.add("For");
	        lhs.add("Geeks");
	        lhs.add("Is");
	        lhs.add("Very helpful");
	  
	        // Traversing elements
	        Iterator<String> itr = lhs.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	    }

}
