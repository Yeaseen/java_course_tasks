package collection;


import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTesting {
	public static void main(String args[])
    {
        // Creating TreeSet and
        // adding elements
        TreeSet<String> ts = new TreeSet<String>();
  
        ts.add("Geeks");
        ts.add("For");
        ts.add("Geeks");
        ts.add("Is");
        ts.add("Very helpful");
  
        System.out.println(ts);
         
         
        // Traversing elements
//        Iterator<String> itr = ts.iterator();
//        while (itr.hasNext()) {
//            System.out.println(itr.next());
//        }
    }
}
