package Lab5;

import java.awt.Color;
import java.util.function.IntBinaryOperator;

import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class BinOpButton extends CalculatorButton {
	
	private IntBinaryOperator operator;

	public BinOpButton (String label, Situation situation, IntBinaryOperator operator) {
		super(label, situation);	
		this.setOperator(operator);
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

	public IntBinaryOperator getOperator() {
		return operator;
	}

	public void setOperator(IntBinaryOperator operator) {
		this.operator = operator;
	}
}
