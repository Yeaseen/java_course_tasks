package generics;

//We use < > to specify Parameter type
class Test2<T, U>
{
 T obj1;  // An object of type T
 U obj2;  // An object of type U

 // constructor
 Test2(T obj1, U obj2)
 {
     this.obj1 = obj1;
     this.obj2 = obj2;
 }

 // To print objects of T and U
 public void print()
 {
     System.out.println(obj1);
     System.out.println(obj2);
 }
}


public class GenericMultiType {

	public static void main(String[] args) {
		Test2 <String, Integer> obj =
	            new Test2<String, Integer>("GfG", 15);
	  
	        obj.print();

	}

}
