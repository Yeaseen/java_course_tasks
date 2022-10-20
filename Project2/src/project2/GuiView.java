package project2;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GuiView extends JFrame {
	
	JFrame jframe;
	GridLayout layout;
	JPanel panel;
	
	UnsortedWordList unsortedL = new UnsortedWordList();
	SortedWordList sortedL = new SortedWordList();
	
	String originalString = "";
	JTextArea originalTextArea = new JTextArea("Displaying the original text \n\n");
	
	JTextArea unsortedTextArea = new JTextArea("Displaying the unsorted linked list\n\n");
	
	public GuiView() {
		
	}
	
	public void populateUnsortedTextArea() {
		
		unsortedTextArea.setEditable(false);
		unsortedTextArea.setLineWrap(true);
		unsortedTextArea.setWrapStyleWord(true);
		
		WordNode p = WordList.intNode;
		while (p.next != null) {
		    
			unsortedTextArea.append(p.next.data+"\n");
		    p = p.next;
		}
	}
	
	public void initiate() {
		jframe = new JFrame("Project 2-");
		
		jframe.setSize(700,600);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);
		
		
		layout = new GridLayout();
		layout.setColumns(3);
		layout.setRows(1);
		
		panel = new JPanel(layout);
		
		
		panel.add(originalTextArea);
		
		
		
		populateUnsortedTextArea();
		panel.add(new JScrollPane(unsortedTextArea));
		
		
		
		
		
		panel.add(new JTextArea("Displaying TextArea 3"));
		
		
		//unsortedL.printList();
		
		jframe.add(panel);
		jframe.setVisible(true);
	}
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		//GuiView v = new GuiView();
//
//	}

}
