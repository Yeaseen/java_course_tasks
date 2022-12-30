package callbys;


class Dog{
	
	String s;
	
	Dog(String in){
		this.s = in;
	}
	
	String getName() {
		return s;
	}
	
	void setName(String in) {
		this.s=in;
	}
}

public class CallByReference {

	public static void main(String[] args) {
	    
		Dog aDog = new Dog("Max"); // this is our Object / Instance
		
	    Dog oldDog = aDog;

	    // we pass the object to foo
	    foo(aDog);
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    
	    System.out.println(aDog.getName().equals("Max")); // true
	    
	    System.out.println(aDog.getName().equals("Fifi")); // false
	    
	    //aDog == oldDog; // true
	    
	    System.out.println(aDog == oldDog);
	}

	public static void foo(Dog d) {
	    
		System.out.println(d.getName().equals("Max")); 
	    
	    // true
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	    d = new Dog("Fifi");
	    
	    System.out.println(d.getName().equals("Fifi")); // true
	}

}
