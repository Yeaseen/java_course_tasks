package project3;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.StringTokenizer; 

public class FileHandler implements ActionListener {
	
	wordGUI newwordGUI;
	
	public FileHandler(wordGUI inputwordGUI) {
		newwordGUI = inputwordGUI;
	}        
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		String menuName;
		menuName = event.getActionCommand();
		if (menuName.equals("Open")) {
			openFile();
			
		} else if (menuName.equals("Quit"))
			System.exit(0);
		
	}
	
	private void openFile() {
		JFileChooser chooser;
		int status;
		chooser = new JFileChooser();
		status = chooser.showOpenDialog(null);
		if (status == JFileChooser.APPROVE_OPTION)

			readSource(chooser.getSelectedFile());
		else
			JOptionPane.showMessageDialog(null, "Open File dialog canceled");
	} // openFile

	/* Reads and processes text file from storage and adds them into linked lists.
	 * @param choosenFile
	 */
	private void readSource(File chosenFile) {
		
		TextFileInput in = new TextFileInput(chosenFile.toString());
		String line = in.readLine();
		int lineNo = 1;
		
		newwordGUI.ll.clear();
		
		while (line != null) {
			// Split up sentences into individual words.
			StringTokenizer token = new StringTokenizer(line," ,.:;");
			
			while (token.hasMoreTokens()) { // if more tokens exist, continue

				String tempString = token.nextToken();
					// Convert String to wordLine Objects
					wordLine tempWord = new wordLine(tempString,lineNo);
					// Add Words to LinkedLists
					newwordGUI.ll.add(tempWord);
			}
			// Queue next line for while loop
			line = in.readLine();
			lineNo++;
		}
		newwordGUI.populateUnsortedTextArea();	
	}	

}
