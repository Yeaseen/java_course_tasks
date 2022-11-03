package project3;

import java.util.LinkedList;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;



public class wordGUI extends JFrame { 
	
	public LinkedList<wordLine> ll = new LinkedList<wordLine>();
	public LinkedList<wordLine> sortedL = new LinkedList<wordLine>();
	
	
	JFrame jframe;
	
	JMenuBar menuBar = new JMenuBar();;
	JMenu menu,list;
	
	JPanel panel;
	GridLayout layout;
	
	JTextArea unsortedTextArea = new JTextArea("LineNumber   Word\n");
	
	public void populateUnsortedTextArea() {
		
		for (int i = 0; i < ll.size(); i++)
			unsortedTextArea.append(ll.get(i).lineNum+" "+ll.get(i).word+"\n");
            
	}
	
	public void populateListTasks() {
		for (int i = 0; i < sortedL.size(); i++)
			System.out.println(sortedL.get(i).lineNum+" "+sortedL.get(i).word);
	}
	
	
	
	public void addFileMenu() {
		
		menu = new JMenu("File");
		FileHandler fmh = new FileHandler(this);
		JMenuItem openItem = new JMenuItem("Open");
		openItem.addActionListener(fmh);
		
		JMenuItem quitItem = new JMenuItem("Quit");
		quitItem.addActionListener(fmh);
		
		menu.add(openItem);
		menu.addSeparator();
		menu.add(quitItem);
		menuBar.add(menu);
		
		
		
		
	}
	
//	public void actionPerformed(ActionEvent e) {
//		String menuName;
//		menuName = e.getActionCommand();
//		if (menuName.equals("A")) {
//			System.out.println("A");
//			
//		}
//		else if (menuName.equals("E")){
//			System.out.println("E");
//		}
//	}
	
	public void addListMenu() {
		list = new JMenu("List");
		
		ListHandler lhc = new ListHandler(this);
		
		JMenuItem AItem = new JMenuItem("A");
		AItem.addActionListener(lhc);
		list.add(AItem);
		list.addSeparator();
		JMenuItem EItem = new JMenuItem("E");
		EItem.addActionListener(lhc);
		list.add(EItem);
		list.addSeparator();
		JMenuItem IItem = new JMenuItem("I");
		list.add(IItem);
		list.addSeparator();
		JMenuItem OItem = new JMenuItem("O");
		list.add(OItem);
		list.addSeparator();
		JMenuItem UItem = new JMenuItem("U");
		list.add(UItem);
		
		menuBar.add(list);
		
	}
	
	public wordGUI() {
		
		
		jframe = new JFrame("Project 3");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(500, 300);
		jframe.setResizable(false);
		jframe.setLocationRelativeTo(null);
	
		
		addFileMenu();
		addListMenu();
		
		jframe.setJMenuBar(menuBar);
		
		layout = new GridLayout();
		layout.setColumns(2);
		layout.setRows(1);
		
		panel = new JPanel(layout);
		
		
		
		unsortedTextArea.setEditable(false);
		unsortedTextArea.setLineWrap(true);
		unsortedTextArea.setWrapStyleWord(true);
		
		panel.add(new JScrollPane(unsortedTextArea));
		jframe.add(panel);
		
		// Show/Enable Frame
		jframe.setVisible(true);
	}
	
	public void populateLists() {
		populateUnsortedTextArea();
//		for (int i = 0; i < ll.size(); i++)
//            System.out.println(ll.get(i).lineNum+" "+ll.get(i).word);
	}

}
