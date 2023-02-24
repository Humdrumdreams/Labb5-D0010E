package labb5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	
	private JFrame frame;

	private JPanel panel;

	
	private JLabel display;
	private JLabel keyPad;
	
	
	public GUI() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,100);
		
		Container canvas = frame.getContentPane();
		canvas.setBackground(Color.GRAY);
		
		
		
	
		//Display
		
		/**
		display = new JLabel("hej på dig");
		display.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		display.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		panel.add(display);
		*/
		
		//KeyPad
		keyPad = new JLabel("");
		
		
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		panel.setLayout(new GridLayout(0, 1));
		

		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//count ++;
		//label.setText("Number of clicks: " + count);
		
		
	}	

}
