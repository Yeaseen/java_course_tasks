package polymorphism1;
class Vehicle{  
	  void run(){
		  System.out.println("Vehicle is moving");
		  }  
	  }  
class Car2 extends Vehicle{  
	  void run(){
		  System.out.println("Car is running safely");
	  }  
}
class Motorbike extends Vehicle{  
	  void run(){
		  System.out.println("MotorBike is running safely");
	  }
} 
public class TestMethodOverriding {

	public static void main(String args[]){  
		  Car2 obj = new Car2();//creating object   
		  obj.run();//calling method 
		  
		  Vehicle vh;
		  vh = new Car2();
		  vh.run();
		  
		  obj = (Car2) vh;
		  obj.run();
		  
		  vh = new Motorbike();
		  vh.run();
		  
		  
		  
		  
		  
		  
		 
		  }  

}
