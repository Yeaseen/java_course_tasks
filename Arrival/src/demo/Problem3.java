package demo;

import javax.swing.JOptionPane;

public class Problem3 {

	public static void main(String[] args) {
		
		String m = JOptionPane.showInputDialog("Give your input below");
		
		System.out.println(m);
	    
				
		int count=0;
		
		
		
		
		for(int i=0;i<m.length();i++){
			
			if(Character.isDigit(m.charAt(i))) count = count + 1;
		}
		
		
	        
	    JOptionPane.showMessageDialog(null, count, "The occurances of digits",JOptionPane.PLAIN_MESSAGE);

	}

}
