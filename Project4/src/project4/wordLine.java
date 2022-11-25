package project4;

import java.util.ArrayList;

public class wordLine implements Comparable<wordLine>{
	
	public String word;
	//public int lineNum;
	public ArrayList<Integer> al = new ArrayList<Integer>();
	
	public String getWord() {
		return word;
	}
	
	@Override
	public int compareTo(wordLine e) {
		
		//return e.word.compareTo(this.word);
		
		return this.word.compareTo(e.word);
	}
	
	
	public wordLine(String inputWord, int line) {
		
		if(line < 1) {
			throw new InvalidLineException("Line no should be greater than 1");
		}
		word = inputWord;
		//lineNum = line;
		al.add(line);
		
	}

}
