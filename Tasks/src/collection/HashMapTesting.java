package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTesting {

	 public static void main(String args[])
	    {
	        // Creating HashMap and
	        // adding elements
	        HashMap<Integer, String> hm = new HashMap<Integer, String>();
	  
	        hm.put(1, "Geeks");
	        hm.put(2, "For");
	        hm.put(3, "Geeks");
	  
	        // Finding the value for a key
	        System.out.println("Value for 1 is " + hm.get(1));
	  
	        // Traversing through the HashMap
	        for (Map.Entry<Integer, String> e : hm.entrySet())
	            System.out.println(e.getKey() + " " + e.getValue());
	    }
}
