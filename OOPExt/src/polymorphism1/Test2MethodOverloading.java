package polymorphism1;

class Helper {

    static int Multiply(int a, int b) {
        return a * b;
    }

    static int Multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    static double Multiply(double a, double b){
        return a * b;
    }
}
 
public class Test2MethodOverloading {

	public static void main(String[] args) {
		System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));
        System.out.println(Helper.Multiply(2, 7, 3));
	}

}
