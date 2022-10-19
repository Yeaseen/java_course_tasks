package demo;

class firstLevel {
	
	public int firstLevel_legs = 5;
	
    public void print_one(){
        System.out.println("class firstLevel has legs "+ firstLevel_legs);
    }
}
 
class seconmdLevel extends firstLevel {
	
	public int seconmdLevel_legs = 10;
    public void print_two() { 
    	System.out.println("class seconmdLevel has legs "+ seconmdLevel_legs); 
    	}
}

class thirdLevel extends seconmdLevel {
	
	public int thirdLevel_legs = 15;
    public void print_three() { 
    	System.out.println("class thirdLevel legs "+ thirdLevel_legs); 
    	}
    
    public void print_allVariables() {

    	
    	System.out.println("class firstLevel legs "+ firstLevel_legs); 
    	System.out.println("class seconmdLevel legs "+ seconmdLevel_legs); 
    	System.out.println("class thirdLevel legs "+ thirdLevel_legs); 
    	}
}


// Driver class
public class MultilevelInheritance {
    public static void main(String[] args)
    {
    	thirdLevel g = new thirdLevel();
        g.print_one();
        g.print_two();
        g.print_three();
        
        
        g.print_allVariables();
        
    }
}

