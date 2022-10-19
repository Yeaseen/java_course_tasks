package demo;


public class Distance {
	private static int INCHES_IN_A_FOOT = 12;
	private static float FEET_IN_A_METER = 0.3048f;
	
	private int feet;
	private int inches;
	
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}

	public Distance() {
		super();
		this.feet = 0;
		this.inches = 0;
	}
	
	public Distance(int feet, int inches) {
		super();
		if(inches > 11) {
			throw new IllegalArgumentException("Inches must be greater than 11");
		}
		this.feet = feet;
		this.inches = inches;
	}
	
	
	public Distance add(Distance p) {
		
		int inch1= this.getInches();
		int inch2= p.getInches();
		
		if( inch1 + inch2 >= Distance.INCHES_IN_A_FOOT ) {
			this.setInches(inch1+inch2-12);
			this.setFeet(this.getFeet() + p.getFeet()+1);
			return this;
			
		}
		this.setFeet( inch1 + inch2 );
		this.setInches(this.getInches() + p.getInches());
		return this;
		
	}
	
	public float metricDistance() {
		
		return  (this.feet + (float)this.inches/12) * (float)Distance.FEET_IN_A_METER;
		
	}


	public static void main(String[] args) {
		
		Distance w1 = new Distance();
		System.out.println("Feet="+ w1.getFeet()+"     Inches="+ w1.getInches());
		
		
		Distance w2 = new Distance(4,9);
		System.out.println("Feet="+ w2.getFeet()+"     Inches="+ w2.getInches());
		
		System.out.println(w2.metricDistance());
		
		Distance w3 = new Distance(3,6);
		System.out.println("Feet="+ w3.getFeet()+"     Inches="+ w3.getInches());
		
		w3.add(w2);
		System.out.println("Feet="+ w3.getFeet()+"     Inches="+ w3.getInches());
		
		
	}


	

}

