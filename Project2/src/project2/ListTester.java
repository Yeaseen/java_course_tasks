package project2;

public class ListTester {

	public static void main(String[] args) {
		
		
		UnsortedWordList a = new UnsortedWordList();
		SortedWordList b = new SortedWordList();
		
		a.append("Bat"); 
		b.add("Bat");		
		a.append("Apple");		
		b.add("Apple");
		a.append("CAST");		
		b.add("CAST");

		a.append("01DOLL");
		b.add("01DOLL");
		
		
		
		a.printList();

		System.out.println("==================");
		
		
		b.printList();

	}

}
