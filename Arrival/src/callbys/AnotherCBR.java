package callbys;


public class AnotherCBR {

	public static void main(String[] args) {
	    Dog aDog = new Dog("Max");
	    Dog oldDog = aDog;

	    foo(aDog);
	    // when foo(...) returns, the name of the dog has been changed to "Fifi"
	    System.out.println(aDog.getName().equals("Fifi")); // true
	    // but it is still the same dog:
	    
	    System.out.println(oldDog.getName().equals("Fifi")); // true
	    
	    //aDog == oldDog; // true
	    System.out.println(aDog == oldDog);
	}

	public static void foo(Dog d) {
		
		System.out.println(d.getName().equals("Max")); // true
		
	    // this changes the name of d to be "Fifi"
	    d.setName("Fifi");
	}
}
