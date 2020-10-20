// Where all the different Rolls would be. This one only returns for spring rolls.


public class Roll {

	public String rollType() {
		
		// What class would be called would be random based on generated number. (for multiple types of rolls).
		springRoll rollSpring = new springRoll();
		return rollSpring.getClass().getSimpleName();
	}

}
