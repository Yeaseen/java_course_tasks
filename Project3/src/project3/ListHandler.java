package project3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class ListHandler implements ActionListener {

	wordGUI newwordGUI;
	public ListHandler(wordGUI inputwordGUI) {
		newwordGUI = inputwordGUI;
	} 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String menuName;
		menuName = e.getActionCommand();
		
		if (menuName.equals("A")) {
			//System.out.println("A");
			newwordGUI.sortedL.clear();
			for (int i = 0; i < newwordGUI.ll.size(); i++) {
				
				char atF= newwordGUI.ll.get(i).word.charAt(0);
				
				if( (atF == 'A') || (atF == 'a') ) {
					newwordGUI.sortedL.add(newwordGUI.ll.get(i));
				}
			}
			
			Collections.sort(newwordGUI.sortedL);
			//Collections.sort(newwordGUI.sortedL, Collections.reverseOrder());
			
			newwordGUI.populateListTasks();
		}
		else if (menuName.equals("E")){
			//System.out.println("E");
			newwordGUI.sortedL.clear();
			for (int i = 0; i < newwordGUI.ll.size(); i++) {
				char atF= newwordGUI.ll.get(i).word.charAt(0);
				if( (atF == 'E') || (atF == 'e') ) {
					newwordGUI.sortedL.add(newwordGUI.ll.get(i));
				}
			}
			Collections.sort(newwordGUI.sortedL);	
			newwordGUI.populateListTasks();
		}
		else if (menuName.equals("I")){
			//System.out.println("I");
			newwordGUI.sortedL.clear();
			for (int i = 0; i < newwordGUI.ll.size(); i++) {
				char atF= newwordGUI.ll.get(i).word.charAt(0);
				if( (atF == 'I') || (atF == 'i') ) {
					newwordGUI.sortedL.add(newwordGUI.ll.get(i));
				}
			}
			Collections.sort(newwordGUI.sortedL);	
			newwordGUI.populateListTasks();
		}
		else if (menuName.equals("O")){
			//System.out.println("O");
			newwordGUI.sortedL.clear();
			for (int i = 0; i < newwordGUI.ll.size(); i++) {
				char atF= newwordGUI.ll.get(i).word.charAt(0);
				if( (atF == 'O') || (atF == 'o') ) {
					newwordGUI.sortedL.add(newwordGUI.ll.get(i));
				}
			}
			Collections.sort(newwordGUI.sortedL);	
			newwordGUI.populateListTasks();
		}
		else if (menuName.equals("U")){
			//System.out.println("U");
			newwordGUI.sortedL.clear();
			for (int i = 0; i < newwordGUI.ll.size(); i++) {
				char atF= newwordGUI.ll.get(i).word.charAt(0);
				if( (atF == 'U') || (atF == 'u') ) {
					newwordGUI.sortedL.add(newwordGUI.ll.get(i));
				}
			}
			Collections.sort(newwordGUI.sortedL);	
			newwordGUI.populateListTasks();
		}
		
	}

}
