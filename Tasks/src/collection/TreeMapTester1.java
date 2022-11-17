package collection;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapTester1 {

	public static void main(String[] args) {
		 // Creating an empty TreeMap
		
		System.out.println("TreeMap using TreeMap() constructor:\n");
		
        Map<Integer, String> tree_map
            = new TreeMap<Integer, String>();
  
        // Mapping string values to int keys
        // using put() method
        tree_map.put(30, "Geeks");
        tree_map.put(20, "4");
        tree_map.put(25, "Geeks");
        tree_map.put(10, "Welcomes");
        tree_map.put(28, "You");
  
        // Printing the elements of TreeMap
        System.out.println("TreeMap: " + tree_map);
    }
	

}
