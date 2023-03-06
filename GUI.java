package Lab5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class GUI extends JFrame implements ActionListener{
	private GridBagLayout bagLayout = new GridBagLayout();
	private GridLayout layout = new GridLayout(4,4,2,2);
	private GridBagConstraints gbd = new GridBagConstraints();
	
	private JPanel canvas;
	private JLabel display;
	private JPanel keyPad;
	
	public GUI() {
		//Set Main Frame
		this.setTitle("Miniräknare");
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    this.setSize(new Dimension(300,150));
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
		display.setPreferredSize(new Dimension(200,50));
		display.setBackground(Color.LIGHT_GRAY);//??????
		display.setOpaque(true);
		display.setBorder(new LineBorder(Color.BLACK, 2));
	    
		//Create keypad;
		keyPad = new JPanel();
		keyPad.setLayout(layout);
		
		Situation situation = new Situation(display);
		
		//Create buttons
			keyPad.add(new DigitButton("7", situation));
			keyPad.add(new DigitButton("8", situation));
			keyPad.add(new DigitButton("9", situation));
			keyPad.add(new BinOpButton("/", situation, (a,b) -> (a/b)));
			
			keyPad.add(new DigitButton("4", situation));
			keyPad.add(new DigitButton("5", situation));
			keyPad.add(new DigitButton("6", situation));
			keyPad.add(new BinOpButton("*", situation, (a,b) -> (a*b)));


			keyPad.add(new DigitButton("1", situation));
			keyPad.add(new DigitButton("2", situation));
			keyPad.add(new DigitButton("3", situation));
			keyPad.add(new BinOpButton("-", situation, (a,b) -> (a-b)));


			keyPad.add(new DigitButton("0", situation));
			keyPad.add(new EqualsButton("=", situation));
			keyPad.add(new CancelButton("C", situation));
			keyPad.add(new BinOpButton("+", situation, (a,b) -> (a+b)));
			if (situation.state == State.Input1) {

				situation.display.setText("0");
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
	
	// main method
	public static void main(String args[]) {
		// creating instance of Frame class
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
