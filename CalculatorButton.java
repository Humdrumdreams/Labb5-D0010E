package labb5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public abstract class CalculatorButton extends JButton 
implements ActionListener{
	


	public Situation situation;

	public CalculatorButton(String label , Situation situation) {
		super(label);
		this.setFont(new Font("monspaced", Font.PLAIN, 20));
		this.setForeground(Color.BLACK);
		this.setBackground(Color.WHITE);
		this.addActionListener(this);
		this.situation = situation;
	}
	
	public void actionPerformed(ActionEvent e) {
		this.transition();
	}
	
		public abstract void transition();
		
	
	
}
	
	
