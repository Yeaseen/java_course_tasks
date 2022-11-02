package project3;

public class wordLine extends IllegalArgumentException{
	
	public String word;
	public int lineNum;
	
	public wordLine(String inputWord, int line) {
		
		if(line < 1) {
			throw new IllegalArgumentException("Number of Arguments must be two");
		}
		word = inputWord;
		lineNum = line;
		
	}

}
