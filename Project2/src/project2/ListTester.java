package project2;

public class ListTester {

	public static void main(String[] args) {
		
		
		UnsortedWordList a = new UnsortedWordList();
		SortedWordList b = new SortedWordList();
		
		a.append("What"); 
		
		b.add("What");
		
		a.append("No");
		
		b.add("Now");
		
		
		
		a.printList();
		System.out.println("==================");
		
		
		b.printList();

	}

}
