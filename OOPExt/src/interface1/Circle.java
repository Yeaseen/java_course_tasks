package interface1;

class Circle implements Shape {
	 
    double pi = 3.14;
    int radius;
 
    // constructor
    Circle(int radius) { this.radius = radius; }
 
    @Override 
    public void draw() {
        System.out.println("Circle has been drawn ");
    }
 
    @Override 
    public double area() {
 
        return (double)((pi * radius * radius));
    }
}
