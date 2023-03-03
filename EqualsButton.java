package Lab5;

@SuppressWarnings("serial")
public class EqualsButton extends CalculatorButton{

	public EqualsButton(String label, Situation situation){
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
				result = situation.binaryOperator.getOperator().applyAsInt(situation.leftOperand, rightOperand);
				situation.display.setText(Integer.toString(result));				
			}
			catch(ArithmeticException e){
				situation.display.setText("Error");	
			}
			situation.binaryOperator.setActive(false);
			situation.leftOperand = 0;
			situation.state = State.HasResult;

			break;
		
		}
	}
}