package labb5;



public  class DigitButton extends CalculatorButton {
		
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DigitButton(String label, Situation situation) {
		super(label, situation);
	}
	
	public void transition() {
		String digit = this.getText();
		switch(situation.state) {
		case Input1:
		case Input2: 
			String displayText = situation.display.getText();
			if(displayText.equals("0")) {
				if(digit.equals("0")) {
					return;
				}
				displayText = digit;
			}
			else {
				displayText += digit;
			}
			situation.display.setText(displayText);
			break;
		case OpReady:
			situation.display.setText(digit);
			situation.state = State.Input2;
			break;
		case HasResult:
			situation.display.setText(digit);
			situation.state = State.Input2;
			break;
		}
		
		
	}
		
}
