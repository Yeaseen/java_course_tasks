package polymorphism1;


class Vehicle{  
	  //defining a method  
	  void run(){
		  System.out.println("Vehicle is moving");
		  }  
	  }  
	//Creating a child class  
class Car2 extends Vehicle{  
	  //defining the same method as in the parent class  
	  void run(){
		  System.out.println("Car is running safely");
	  }  
	  
}
class Motorbike extends Vehicle{  
	  //defining the same method as in the parent class  
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
		  
		  vh = new Motorbike();
		  vh.run();
		 
		  }  

}
