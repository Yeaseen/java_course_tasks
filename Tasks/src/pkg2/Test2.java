package pkg2;

//import pkg1.*;

import pkg1.Addition;

public class Test2 extends Addition {

	public static void main(String[] args) {
		
//		Addition obj = new Addition();
//		
//		System.out.println(obj.a);
//		
//		
//		System.out.println(obj.getProduct());
//		
//		System.out.println(obj.m);
		
		Test2 obj = new Test2();
		
		System.out.println(obj.m);
		//System.out.println(obj.getProduct());
		
		
		System.out.println(obj.a);
		
		obj.setX(80);
		System.out.println(obj.getX());

	}

}
