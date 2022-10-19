package demo;

public class Demo {
	
	public static int getSum(int a, int b) {
		return a+b;
	}
	public static int getProduct(int a, int b) {
		return a*b;
	}

	
	
	public static void main(String[] args) {
		
		//System.out.println(args[0] );
		
		//System.out.println(args[1] );
		
		//System.out.println(args.length);
		 
		
		if(args.length != 2) {
			throw new IllegalArgumentException("Number of Arguments must be two");
		}
		
		int sum = getSum(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		
		System.out.println(args[0]+" + "+args[1]+" = "+ sum);
		
		int product = getProduct(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		
		
		System.out.println(args[0]+" + "+args[1]+" = "+ product);

	}
	
	

}
