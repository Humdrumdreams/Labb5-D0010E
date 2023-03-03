package labb5;

import java.awt.Color;
import java.util.function.IntBinaryOperator;

import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class BinOpButton extends CalculatorButton {
	
	IntBinaryOperator operator;

	public BinOpButton (String label, Situation situation, IntBinaryOperator operator) {
		super(label, situation);	
		this.operator = operator;
	}
	
	void setActive(boolean state) {
		this.setBorder(state ? new LineBorder(Color.RED) : new LineBorder(Color.GRAY));
	}

	public void transition() {
		switch(situation.state) {
		case Input1: 
		case HasResult:
			situation.leftOperand = Integer.parseInt(situation.display.getText());
			situation.state = State.OpReady;
			situation.binaryOperator = this;
			setActive(true);
			break;
		case Input2:
			break;
		case OpReady:
			situation.binaryOperator.setActive(false);
			situation.binaryOperator = this;
			setActive(true);
			break;
		}
	}
}
