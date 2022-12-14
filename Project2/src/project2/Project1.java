package project2;

import java.awt.GridLayout;
import java.io.File;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
 


public class Project1 extends JFrame {
	
	JFrame jframe;
	
	public static File myFIle; 
	
	public Project1() {
		
		jframe = new JFrame("Project 2-");
		
		jframe.setSize(600,600);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.setLocationRelativeTo(null);
		
		
		GridLayout layout = new GridLayout();
		layout.setColumns(3);
		layout.setRows(1);
		
		
		
		JPanel panel = new JPanel(layout);
		
        JTextArea textArea1 = new JTextArea("Displaying TextArea 1\n");
        
        textArea1.setEditable(false);
        textArea1.append("It\n");
        
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        
        myFIle = new File("/Users/yeaseenarafat/Y_E_@_S_E_EN/JAVA/Project2/src/project2/input.txt");
		
		TextFileInput in = new TextFileInput(myFIle.toString()); 
		
		String eachLine = in.readLine();
		
		
	    String originalText ="";
	    
	    while (eachLine != null){
	    
	        originalText = originalText + eachLine;
	        
	    	StringTokenizer token = new StringTokenizer(eachLine," ,:;,");
	    	
	    	while (token.hasMoreTokens()) { // if more tokens exist, continue

				String tempString = token.nextToken();
						textArea1.append(tempString+"\n");	

			}
			// Queue next line for while loop
	    	eachLine = in.readLine();
	    }
        
        
        
		
        panel.add(new JScrollPane(textArea1));
		
		
		
		panel.add(new JScrollPane(new JTextArea("Displaying TextArea 3")));
		
		panel.add(new JTextArea("Displaying TextArea 3"));
		
		
		jframe.add(panel);
		
		jframe.setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project1 v = new Project1();

	}

}