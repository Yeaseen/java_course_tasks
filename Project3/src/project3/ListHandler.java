package project3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
//			System.out.println("A");
			for (int i = 0; i < newwordGUI.ll.size(); i++) {
				char atF= newwordGUI.ll.get(i).word.charAt(0);
				if( (atF == 'A') || (atF == 'a') ) {
					newwordGUI.sortedL.add(newwordGUI.ll.get(i));
				}
			}
				
			newwordGUI.populateListTasks();
		}
		else if (menuName.equals("E")){
			System.out.println("E");
		}
		
	}

}
