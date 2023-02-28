package Lab5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class GUI extends JFrame implements ActionListener{
	GridBagLayout bagLayout = new GridBagLayout();
	GridLayout layout = new GridLayout(0,4);
	GridBagConstraints gbd = new GridBagConstraints();
	private JPanel canvas;
	
	private JLabel display;
	private JPanel keyPad;
	
	private JButton button;
	
	public GUI() {
		//Set Main Frame
		this.setTitle("Miniräknare");
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setSize(new Dimension(500,450));
	    this.setResizable(false);
	    
	    //Create Canvas	    
	    canvas = new JPanel();
	    canvas.setBackground(Color.GRAY);
		this.add(canvas);
	    this.setContentPane(canvas);
	    canvas.setLayout(bagLayout);

		//Create Display
		display = new JLabel("0", JLabel.RIGHT);
		display.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 30));
		display.setPreferredSize(new Dimension(339,50));
		display.setBackground(Color.LIGHT_GRAY);//??????
		display.setOpaque(true);
		display.setBorder(new LineBorder(Color.BLACK, 2));
	    
		//Create keypad;
		keyPad = new JPanel();
		keyPad.setLayout(layout);
		
		//Create buttons
		for (int i = 0; i<16; i++) {
			button = new JButton(); //Change class to calculatorButton
			button.setText("Button"+Integer.toString(i));
			keyPad.add(button, gbd);
			button.addActionListener(this);
		}
		
		//Add
		gbd.gridx = 0;
		gbd.gridy = 0;
		gbd.ipadx = 3;
		canvas.add(display, gbd);
		gbd.gridwidth = 2;
		gbd.gridx = 0;
		gbd.gridy = 1;
		canvas.add(keyPad, gbd);
		
		this.pack();
	    this.setVisible(true);
		}
	
	public void actionPerformed(ActionEvent e) {
		int input ;
		
			display.setText(e.getSource().toString());
		}
	
/*	// main method
	public static void main(String args[]) {
		// creating instance of Frame class
		new GUI();
	}
*/	
	
}
