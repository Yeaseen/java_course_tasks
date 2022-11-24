package runtimestack;

public class RecursionBasic {
	
	public static int factorial(int num){
		   if(num==0) //break condition of Recursion Since 0! is always 1
		      return 1;
		   return num * factorial(num-1);
		}
	
	
	public static int fibonacci(int num){
		   if(num==0) //break condition of Recursion Since 0! is always 1
		      return 1;
		   return num * factorial(num-1);
		}
	
	static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
	
	
	public static int addxy(int a, int b) {
	    if (a==0)
	        return b;
	    else if (b==0) 
	        return a;
	    else
	        return 1 + addxy(a, b-1);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int result = addxy(2,6);
		System.out.println(result);
		
		
		int result2 = factorial(4);
		System.out.println(result2);
       
		
		 System.out.println(fib(8));
    }
   

}


//addxy(6,6)
//1+addxy(6,5)
//1+1+addxy(6,4)
//1+1+1+addxy(6,3)
//1+1+1+1addxy(6,2)
//1+1+1+1+1+addxy(6,1)
//1+1+1+1+1+1+addxy(6,0) = 12