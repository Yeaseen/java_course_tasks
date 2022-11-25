package collection;

import java.util.ArrayList;

public class ArrayListTesting {
	  // Main Method
    public static void main(String[] args)
    {
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();
  
        // Appending new elements at
        // the end of the list
        for (int i = 0; i < 5; i++)
            al.add(i);
         
        al.add(23);
        al.add(15);
        al.add(10);
        
        // Printing elements
        System.out.println(al);
  
        // Remove element at index 3
        al.remove(5);
  

        
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
  
        System.out.println('\n');
        al.sort(null);
        
        
        // Printing elements one by one
        
        for (int i = 0; i < al.size(); i++)
            System.out.print(al.get(i) + " ");
    }

	

}
