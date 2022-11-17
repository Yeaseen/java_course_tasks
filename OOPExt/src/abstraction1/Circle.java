package abstraction1;

public class Circle extends Shape {
	double radius;
	 
    public Circle(String color, double radius)
    {
 
        // calling Shape constructor
        super(color);
        
        System.out.println("Circle constructor called");
        this.radius = radius;
    } 
 
    @Override  
    double area() {
        return Math.PI * Math.pow(radius, 2);
    } 
 
    @Override 
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is : " + area();
    }

}
