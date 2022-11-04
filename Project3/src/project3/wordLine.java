package project3;

public class wordLine implements Comparable<wordLine>{
	
	public String word;
	public int lineNum;
	
	public String getWord() {
		return word;
	}
	
	@Override
	public int compareTo(wordLine e) {
		
		return e.word.compareToIgnoreCase(this.word);
		
		//return this.word.compareToIgnoreCase(e.word);
	}
	
	
	public wordLine(String inputWord, int line) {
		
		if(line < 1) {
			throw new InvalidLineException("Line no should be greater than 1");
		}
		word = inputWord;
		lineNum = line;
		
	}

}
