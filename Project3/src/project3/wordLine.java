package project3;

public class wordLine extends IllegalArgumentException implements Comparable<wordLine>{
	
	public String word;
	public int lineNum;
	public String getWord() {
		return word;
	}
	
	@Override
	public int compareTo(wordLine e) {
		return this.getWord().compareTo(e.getWord());
	}
	
	public wordLine(String inputWord, int line) {
		
		if(line < 1) {
			throw new IllegalArgumentException("Number of Arguments must be two");
		}
		word = inputWord;
		lineNum = line;
		
	}

}
