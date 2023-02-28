package Labb5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame {
	private JPanel canvas;
	private JPanel panel;
	
	private JLabel display;
	private JLabel keyPad;
		
	public GUI() {
		//Set Main Frame
		this.setTitle("Miniräknare");
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setSize(new Dimension(500,650));
	    this.setResizable(false);
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    //Create Canvas
	    canvas = new JPanel();
		canvas.setBounds(new Rectangle(0,0,500,650));
		canvas.setBackground(Color.RED);
		
		this.add(canvas);
	 
		
		//Create Display
		display = new JLabel("TEXT");
		display.setBackground(Color.BLUE);//??????
		display.setAlignmentX(RIGHT_ALIGNMENT);
		display.setOpaque(true);
		canvas.add(display);
	    
	    //this.pack();
		
	    this.setVisible(true);
		}
	// main method
	public static void main(String args[]) {
		// creating instance of Frame class
		new GUI();
	}
	
	
}
