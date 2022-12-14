package project2;

public class SortedWordList extends WordList {
	
	
	public void add(String word) {
		
		 WordNode temp = new WordNode(word);
	        //Check if there is a first node
	        if (first.next == null) {  
	            last.next = temp;
	            last = temp;
	            length++;
	            return;
	        }
	        
	        // If existing nodes exist then continue
	        WordNode node = first;
	        
	        // Find the new node.
	        while (node.next != null && node.next.data.compareToIgnoreCase(word) < 0) {
	            node = node.next;
	        }
	        
	        // If node is last, insert.
	        if (node.next == null) {
	            last.next = temp;
	            last = temp;
	            length++;
	        }
	        // Move Existing Node and set new node
	        else {
	            temp.next = node.next;
	            node.next = temp;
	            length++;
	        }
	}
	


	public static void main(String[] args) {

		SortedWordList a = new SortedWordList();
		a.add("What");
		a.add("No");
		
		a.printList();

	}

}
