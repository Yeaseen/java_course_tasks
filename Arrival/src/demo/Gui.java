package demo;

import java.awt.*;

import javax.swing.*;


public class Gui {
	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	private int clicks =0;
	private JLabel label;
	
	public Gui() {
		initialization();
	}
	
	public void initialization() {
		
		frame = new JFrame("My First JFrame GUI");
		frame.setVisible(true);
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		panel = new JPanel();
		panel.setBackground(Color.cyan);
		panel.setLayout(null);
		
		button = new JButton("Click to increase");
		button.setBounds(230, 170, 130, 30);
		label = new JLabel("Click Count: "+clicks);
		label.setBounds(260, 140, 130, 30);
		
		
		button.addActionListener(e-> actionPerformed()); 
		
	
		panel.add(label);
		panel.add(button);
		frame.add(panel);
		
		
	}
	
	public void actionPerformed() {

        clicks++;
        label.setText("Click Count: " +clicks);

    }
	
	
    public static void main (String[] args) {

	        new Gui();

	    }
	
	
	
	
}
