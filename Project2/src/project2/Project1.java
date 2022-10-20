package project2;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Project1 extends JFrame {
	
	JFrame jframe;
	
	public Project1() {
		jframe = new JFrame("Project 2-");
		
		jframe.setSize(700,600);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);
		
		
		GridLayout layout = new GridLayout();
		layout.setColumns(3);
		layout.setRows(1);
		
		
		
		JPanel panel = new JPanel(layout);
		

		panel.add(new JTextArea("Displaying TextArea 1"));
		panel.add(new JTextArea("Displaying TextArea 2"));
		panel.add(new JTextArea("Displaying TextArea 3"));
		
		jframe.add(panel);
		jframe.setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project1 v = new Project1();

	}

}