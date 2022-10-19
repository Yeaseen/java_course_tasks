package demo;


class one {
	
	public int legs = 5;
	
    public void print_one(){
        System.out.println("class one has legs "+ legs);
    }
}
 
class two extends one {
	
	public int legs = 10;
    public void print_two() { 
    	System.out.println("class two legs "+ legs); 
    	}
}


// Driver class
public class SingleInheritance {
    public static void main(String[] args)
    {
        two g = new two();
        g.print_one();
        g.print_two();
        
    }
}


