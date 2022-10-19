package demo;

import javax.swing.JOptionPane;

public class Problem5 {

	public static void main(String[] args) {
		
		String m = JOptionPane.showInputDialog("Give your input below");
	    
		int count=0;
		
		for(int i=0; i<m.length()-1 ;i++)
		{
			if( Character.isDigit(m.charAt(i)) && Character.isDigit(m.charAt(i+1)) )
			count++;
		}
	        
	    JOptionPane.showMessageDialog(null,"Two digits happen "+count+" times", "The occurances of digits", JOptionPane.PLAIN_MESSAGE);
		
		


	}

}
