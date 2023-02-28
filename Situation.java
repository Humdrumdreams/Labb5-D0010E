package labb5;

import javax.swing.JLabel;
import labb5.Buttons.BinOpButton;

public class Situation {
	State state = State.Input1;
	JLabel display;
	BinOpButton binaryOperator;
	int leftOperand;

	Situation(JLabel display){
		this.display = display;
	}
}
