package pkg2;

public class FS {
	
	
	public FS(int id) { accountId = id; }
	 
	
	final int accountId;
	
	public static double rate = 2.5;
	
	static final int odLimit = 1005;
	
	public double getRate() {
		return rate;
	}


public static void main(String[] args) {
	FS first = new FS(123);
	FS second = new FS(456);

	// The following prints 123
	//System.out.println(first.accountId);
	// The following prints 456
	//System.out.println(second.accountId);

	// Next line triggers a compile error
	//first.accountId = 789;
	
	//second.accountId = 66776;
	
	System.out.println(first.rate);
	System.out.println(second.rate);
	
	first.rate =3;
	
	System.out.println(first.rate);
	System.out.println(second.rate);
	
	// Both lines print out 1000
	System.out.println(first.odLimit);
	System.out.println(second.odLimit);
	// Next line triggers a compile error
    //first.odLimit = 500;
	
	
	

	}

}
