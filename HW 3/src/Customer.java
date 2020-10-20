import java.util.concurrent.ThreadLocalRandom;

// Is supposed to generate 3 types of customers, this only generates casual customers.

public class Customer {

	// https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
	public static int getRandomNumber(int min, int max) {
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}
	
	public static String customerType() {
		return casualCustomer.class.getSimpleName();
	}
	public static String customerCreater() {
		return casualCustomer.buyRoll();
	}
}
