package nestedClass;

public class Outer {
	
	// Class 2
    // Simple nested inner class
    class Inner {
    	
    	int p=100;
        // show() method of inner class
        public void show()
        {
 
            // Print statement
            System.out.println("In a nested class method");
        }
        
    }

	public static void main(String[] args) {
		
        // Note how inner class object is created inside
        // main()
        Outer.Inner in = new Outer().new Inner();
 
        // Calling show() method over above object created
        in.show();
        
        System.out.println(in.p);

	}

}
