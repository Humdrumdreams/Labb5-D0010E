package labb5;
//test/

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI extends JFrame implements ActionListener{
	
	
	private JFrame frame;
	private JPanel canvas; 

	private JLabel display;
	private JPanel keyPad;
	
	private GridBagConstraints gbc = new GridBagConstraints();
	
	
	public GUI() {
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,350));
		
		//Skapa JPanel canvas
		canvas = new JPanel();
		canvas.setBackground(Color.LIGHT_GRAY); 
		canvas.setLayout(new GridBagLayout());
		frame.add(canvas);
		
		//Skapa JLabel display
		display = new JLabel("55555");
		display.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		display.setFont(new Font("Times New Roman", Font.BOLD, 25));
		display.setHorizontalAlignment(JLabel.RIGHT);
		display.setPreferredSize(new Dimension(300,50));
		canvas.add(display);
		
		//Skapa JPanel keyPad 
		keyPad = new JPanel();
		keyPad.setBackground(Color.WHITE);
		keyPad.setPreferredSize(new Dimension(300,270));
		gbc.gridx=0;
		gbc.gridy=1;
		canvas.add(keyPad,gbc);
		
		
		
		//Jag tror inte detta är korrekt enligt Håkans instruktion.
		//Jag tror att knapparna ska skapas i varje specifik Button klass.
		keyPad.setLayout(new GridLayout(4,4));
		
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b_add, b_sub, b_mul, b_div, b_equ, b_can;
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b_div = new JButton("/");
		b_mul = new JButton("*");
		b_sub = new JButton("-");
		b_add= new JButton("+");
		b_can= new JButton("C");
		b_equ= new JButton("=");
		
		keyPad.add(b7);
		keyPad.add(b8);
		keyPad.add(b9);
		keyPad.add(b_div);
		keyPad.add(b4);
		keyPad.add(b5);
		keyPad.add(b6);
		keyPad.add(b_mul);
		keyPad.add(b1);
		keyPad.add(b2);
		keyPad.add(b3);
		keyPad.add(b_sub);
		keyPad.add(b0);
		keyPad.add(b_equ);
		keyPad.add(b_can);
		keyPad.add(b_add);
		
		frame.pack();
		frame.setVisible(true);
		
	}

	@Override
	
		
		
	}	

}
