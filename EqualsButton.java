package labb5;

public class EqualsButton extends CalculatorButton{
	EqualsButton(String label, Situation situation){
		super(label, situation);
	}
	public void transition() {
		switch(situation.state) {
		case Input1:
		case OpReady:
		case HasResult:
			break;
		case Input2:
			int rightOperand = Integer.parseInt(situation.display.getText());
			
			int result = 0;
			
		try {
			result = situation.binaryOperator.operator.applyAsInt(situation.leftOperand, rightOperand);
			
		}
		catch(ArithmeticException e){
			situation.display.setText("Error");	
		}
		situation.binaryOperator.setActive(false);
		situation.binaryOperator = null;
		situation.state = State.HasResult;
		break;
		
		}
	}
}
