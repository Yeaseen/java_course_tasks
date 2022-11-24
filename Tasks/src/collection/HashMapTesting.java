package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTesting {

	 public static void main(String args[])
	    {
	        // Creating HashMap and
	        // adding elements
		 	Map<Integer, String> hm  = new HashMap<Integer, String>();
	        
		 	
		 	
	        System.out.println("Is the Map empty? " + hm.isEmpty());
	  
	        hm.put(1, "Geeks");
	        hm.put(2, "For");
	        hm.put(47, "what");
	        hm.put(3, "Geeks");
	        hm.put(7, "wait");
	        hm.put(3, "nopee");
	        
	        System.out.println(hm);
	        
	        System.out.println("Is the Map empty? " + hm.isEmpty());
//	  
	        // Finding the value for a key
	        System.out.println("the value by key=47: " + hm.get(47));
	        System.out.println("the value by key=5: " + hm.get(5));
	        
	        System.out.println("Size of the Map: " + hm.size());
	        // Traversing through the HashMap
	        for (Map.Entry<Integer, String> e : hm.entrySet()) {
	            System.out.println(e.getKey() + " " + e.getValue());
	        }
	        
	        System.out.println("is key=5 exixts? " + hm.containsKey(5));
	        System.out.println("is key=47 exixts? " + hm.containsKey(47));
	        
	        System.out.println("is value=\"what\" exixts? " + hm.containsValue("what"));
	        
	        System.out.println("is value=\"nothing\" exixts? " + hm.containsValue("nothing"));
//	        
//
	        
	        System.out.println("Get all keys in a set: " + hm.keySet());
	        System.out.println("Get all values in a set: " + hm.values());
//	       
	        System.out.println("Remove key=2 " + hm.remove(2));
//	        
	        System.out.println("is key=2 exixts? " + hm.containsKey(2));
//	        
	        System.out.println("the whole SET= " + hm.entrySet());
//	        
//	        
	        Map<Integer, String> hm2  = new HashMap<Integer, String>();
//	        
	        hm2.putAll(hm);
	        System.out.println("is hm==hm2: " + hm2.equals(hm));
//	        
	        hm2.put(7, "John");
	        System.out.println("is hm==hm2: " + hm2.equals(hm));
//	        
	        for (Map.Entry<Integer, String> e : hm2.entrySet()) {
	            System.out.println(e.getKey() + " " + e.getValue());
	        }
//	        
	        hm2.clear();
	        System.out.println("Is the Map 2 empty? " + hm2.isEmpty());
//        
	    }
}
