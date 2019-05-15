
public class SkunkDice extends Dice{

	public SkunkDice() {
		
	}
	

	public boolean isSkunk()
	{
		return (getDie1() == 1 || getDie2() == 1 && getDiceValue() != 2);
	}

	public boolean isDoubleSkunk() {
		return (getDiceValue() == 2);
	}
	
}