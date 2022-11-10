package demo;

public class TesterBook {
public static void main(String[] args) {
		
		Book b1 = new Book("Orientalism", "E W SAID", -45.55f);
		
	    //Book b1 = new Book("Orientalism",null,45.55f);
	
		//Book b1 = new Book(null,"E W SAID",-45.55f);
		
		//Book b1 = new Book("Orientalism","E W SAID",45.55f);	
		System.out.println(b1.getTitle());
		
		System.out.println(b1.getAuthor());
		
		System.out.println(b1.getPrice());

	}
}
