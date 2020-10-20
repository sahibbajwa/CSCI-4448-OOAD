// Implements a casual customer.


public class casualCustomer extends Customer {


	@SuppressWarnings("unused")
	public static String buyRoll() {
		int itemstoBuy = getRandomNumber(0, 3);
	
		for (int x = 0; x <= itemstoBuy; x++) {
			
			// Call to Roll
			Roll newroll = new Roll();
			
			return newroll.rollType();
		}
		
		return null;
	}
}
