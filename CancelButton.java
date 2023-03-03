package labb5;

public class CancelButton extends CalculatorButton{
	CancelButton(String label, Situation situation){
		super(label, situation);
	}
	
	public void transition(){
		situation.state = State.Input1;
		if(situation.binaryOperator != null) {
			situation.binaryOperator.setActive(false);
		}
		situation.binaryOperator = null;
		situation.display.setText("0");
		
	}
}
