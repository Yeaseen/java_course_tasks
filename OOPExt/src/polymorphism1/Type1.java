package polymorphism1;

class Shapes {
	  public void area() {
	    System.out.print("The formula for area of --> ");
	  }

}

class Triangle extends Shapes {
	  public void area() {
	    System.out.println("Triangle is ½ * base * height ");
	  }
}
	
class Circle extends Shapes {
	  public void area() {
	    System.out.println("Circle is 3.14 * radius * radius ");
	  }
}
	
public class Type1 {

	public static void main(String[] args) {
	    Shapes myShape = new Shapes();  // Create a Shapes object
	    
	    Shapes myTriangle = new Triangle();  // Create a Triangle object
	    Shapes myCircle = new Circle();  // Create a Circle object
	    
	    myShape.area();
	    myTriangle.area();
	    
	    
	    myShape.area();
	    myCircle.area();
	  }
}
