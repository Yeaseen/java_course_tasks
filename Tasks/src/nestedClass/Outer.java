package nestedClass;

public class Outer {
	
	// Class 2
    // Simple nested inner class
	private int outVar;
	public Outer(int input) {
		outVar = input;
	}
	
    class Inner {
    	
    	int p;
    	
    	public Inner(int input) {
    		p=input;
    	}
        // show() method of inner class
        public void show(){
 
            // Print statement
        	System.out.println(outVar);
            System.out.println("In a nested class method");
        }
        
    }

	public static void main(String[] args) {
		
        // Note how inner class object is created inside
        // main()
        Outer.Inner in = new Outer(100).new Inner(10);
 
        // Calling show() method over above object created
        in.show();
        
        //System.out.println(in.outVar);
        
        System.out.println(in.p);

	}

}
