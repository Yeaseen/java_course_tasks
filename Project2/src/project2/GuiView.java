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
	
	JTextArea originalTextArea = new JTextArea("Displaying ORIGINAL text \n\n");
	
	JTextArea unsortedTextArea = new JTextArea("Displaying UNSORTED linked list\n\n");
	
	JTextArea sortedTextArea = new JTextArea("Displaying SORTED linked list\n\n");
	
	public GuiView() {
		
	}
	
	public void populateOriginalTextArea() {
		
		originalTextArea.setEditable(false);
		originalTextArea.setLineWrap(true);
		originalTextArea.setWrapStyleWord(true);
		
		originalTextArea.append(originalString);
	}
	
	public void populateUnsortedTextArea() {
		
		unsortedTextArea.setEditable(false);
		unsortedTextArea.setLineWrap(true);
		unsortedTextArea.setWrapStyleWord(true);
		
		WordNode p = unsortedL.first;
		while (p.next != null) {
			//System.out.println("in unSorted"+p.next.data);
			unsortedTextArea.append(p.next.data+"\n");
		    p = p.next;
		}
		
	}
	
	public void populateSortedTextArea() {
		
		sortedTextArea.setEditable(false);
		sortedTextArea.setLineWrap(true);
		sortedTextArea.setWrapStyleWord(true);
		
		WordNode q = sortedL.first;
		while (q.next != null) {
		    //System.out.println("in Sorted"+q.next.data);
			sortedTextArea.append(q.next.data+"\n");
		    q = q.next;
		}
		
		 
	}
	
	public void initiate() {
		
		jframe = new JFrame("Project 2");
		
		jframe.setSize(700,600);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);
		
		
		layout = new GridLayout();
		layout.setColumns(3);
		layout.setRows(1);
		
		panel = new JPanel(layout);
		
		
		
		populateOriginalTextArea();
		panel.add(new JScrollPane(originalTextArea));
		
		
	
		populateUnsortedTextArea();
		panel.add(new JScrollPane(unsortedTextArea));
		
		
		populateSortedTextArea();
		panel.add(new JScrollPane(sortedTextArea));
		
		
		
		
		jframe.add(panel);
		jframe.setVisible(true);
	}
	

}
