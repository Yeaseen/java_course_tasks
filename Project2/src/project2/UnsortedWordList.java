package project2;

public class UnsortedWordList extends WordList {
	  
	/*
	 * Appends a WordNode data element to this LinkedList
     * @param word Word object that is being appended into a WordNode.
     */
	
	
    public void append(String word) {
        WordNode temp = new WordNode(word);
        last.next = temp;  
        last = temp;
        length++;
        }
    
    

	public static void main(String[] args) {
		
		UnsortedWordList a = new UnsortedWordList();
		a.append("WHAT");
		a.append("NO way");
		
		a.printList();

	}

}
