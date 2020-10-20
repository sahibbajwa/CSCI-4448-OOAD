import java.util.concurrent.ThreadLocalRandom;

// Extend and change sauce for hot sauce or no sauce.

public class hotSauce extends sauceDecorator {

	public hotSauce(Sauce csauce) {
		super(csauce);
	}
	
	@Override
	public void setSauce() {
		super.setSauce();
		
		int yesnosauce = getRandomNumber(0, 1);
		
		if (yesnosauce == 1) {
			System.out.print("hot sauce");
		}
		
		else {
			System.out.print("no sauce");
		}
		
	}
	
//	private String setSauceWithhotSauce() {
//		int yesnosauce = getRandomNumber(0, 1);
//		String sauce;
//		
//		if (yesnosauce == 1) {
//			sauce = "hot sauce";
//		}
//		
//		else {
//			sauce = "no sauce";
//		}
//		
//		return(sauce);
//	}
	
	
	//https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
	public static int getRandomNumber(int min, int max) {
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}
}
