package pkg1;

public class Addition {
	
	int p=10;
	
	int q=12;
	
	int getProduct() {
		return p*q;
	}
	
	protected int m=50;
	
	
	
	private int x;
	public void setX(int input) {
		x = input;
	}
	public int getX() {
		return x;
	}
	
	
	public int a=20;
	
	
	public static void main(String[] args) {
		Addition obj = new Addition();
		
		System.out.println(obj.getProduct());
		System.out.println(obj.m);
		
	}
	


}



