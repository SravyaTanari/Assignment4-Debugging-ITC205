//Initial commit by 11600546-Sravya Tanari for Dice.java

public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		return value;
	}

	public DiceValue roll() {             
		return DiceValue.getRandom();   //Bug found in this line  
	}		
	
	public String toString() {
		return value.toString();
	}
}
