package nestedClass;

public class Outer3 {
	
   void outerMethod() {
	   
      int x = 98;
      
      System.out.println("inside outerMethod");
      
      class Inner {
         void innerMethod() {
            System.out.println("x= "+x);
         }
      }
      
      Inner y = new Inner();
      y.innerMethod();
      
   }


}
