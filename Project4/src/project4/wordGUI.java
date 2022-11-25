package project4;

import java.util.LinkedList;

import java.awt.GridLayout;


import javax.swing.*;



public class wordGUI extends JFrame { 
	
	public LinkedList<wordLine> ll = new LinkedList<wordLine>();
	
	public LinkedList<wordLine> sortedL = new LinkedList<wordLine>();
	
	
	JFrame jframe;
	JPanel panel;
	GridLayout layout;
	
	
	JMenuBar menuBar = new JMenuBar();;
	JMenu menu,list;
	
	
	JTextArea unsortedTextArea = new JTextArea("Please Select a File");
	
	JTextArea sortedTextArea = new JTextArea("Please Select an Option from List");

	
	public void populateListTasks() {
		
		sortedTextArea.setText(null);
		
		sortedTextArea.append("Word     Lines\n");
		
		for (int i = 0; i < sortedL.size(); i++) {
			sortedTextArea.append(sortedL.get(i).word+": ");
		    
			for (int j = 0; j < sortedL.get(i).al.size(); j++) {
				if(j==sortedL.get(i).al.size()-1) sortedTextArea.append(sortedL.get(i).al.get(j)+"\n");
				else sortedTextArea.append(sortedL.get(i).al.get(j)+", ");
			}
			
		}
			
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
		IItem.addActionListener(lhc);
		list.add(IItem);
		list.addSeparator();
		JMenuItem OItem = new JMenuItem("O");
		OItem.addActionListener(lhc);
		list.add(OItem);
		list.addSeparator();
		JMenuItem UItem = new JMenuItem("U");
		UItem.addActionListener(lhc);
		list.add(UItem);
		
		menuBar.add(list);
		
	}
	
	public wordGUI() {
		
		
		jframe = new JFrame("Project4");
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
		
		
		sortedTextArea.setEditable(false);
		sortedTextArea.setLineWrap(true);
		sortedTextArea.setWrapStyleWord(true);
		panel.add(new JScrollPane(sortedTextArea));
		
		
		jframe.add(panel);
		
		// Show/Enable Frame
		jframe.setVisible(true);
	}
	


}
