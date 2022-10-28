package collection;

import java.util.Vector;

public class VectorTesting {
	
	public static void main(String[] args)
    {
  
        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 0; i < 5; i++)
            v.add(i);
  
        // Printing elements
        System.out.println(v);
  
        // Remove element at index 3
        v.remove(3);
  
        // Displaying the Vector
        // after deletion
        System.out.println(v);
  
        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
        
        
    }

}
