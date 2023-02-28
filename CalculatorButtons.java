package labb5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class CalculatorButton extends JButton 
implements ActionListener{
	
	
	private State state;

	public CalculatorButton(String s , State state) {
		super(s);
		this.setFont(new Font("monspaced", Font.PLAIN, 20));
		this.setForeground(Color.BLACK);
		this.setBackground(Color.WHITE);
		this.addActionListener(actionListener);
		this.state = state;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.transition();
	}
	
		abstract void transition();
		
	
	
}
	
	

	
	
			
	
