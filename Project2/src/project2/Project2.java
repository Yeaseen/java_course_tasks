package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Project2 {
	
	public static File myFIle;
	
	public static GuiView gui = new GuiView();

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		myFIle = new File("/Users/yeaseenarafat/Y_E_@_S_E_EN/JAVA/Project2/src/project2/input.txt");
		
		TextFileInput in = new TextFileInput(myFIle.toString());
		String line = in.readLine();
		
		
	 
	    while (line != null){
	    	
	    	
	    	gui.originalString+=line+"\n";
	    	
	    	StringTokenizer token = new StringTokenizer(line," ,.:;");
	    	
	    	while (token.hasMoreTokens()) { // if more tokens exist, continue

				String tempString = token.nextToken();
				

		
					//System.out.println(tempString);
					// Add Words to LinkedLists
					gui.unsortedL.append(tempString);
					//newwordGUI.sortedL.add(tempWord);
				

			}
			// Queue next line for while loop
			line = in.readLine();
	    }
	    
	    
	    gui.initiate();
	  
		

	}

}
