package project2;

public class UnsortedWordList extends WordList {

    
	public void append(String word) {
        
	WordNode temp = new WordNode(word);  
		
        last.next = temp;  
        last = temp;
        length++;
    }
    
    

	public static void main(String[] args) {
		
		UnsortedWordList a = new UnsortedWordList();
		
		a.append("Wow");
		a.append("hat");
		
		a.printList();

	}
 
}
