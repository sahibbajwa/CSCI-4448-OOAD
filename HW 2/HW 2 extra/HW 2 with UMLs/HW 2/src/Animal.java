import java.util.concurrent.ThreadLocalRandom;

//eat roam sleep
//https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java


//The Animal class is a good example of Abstraction because it clearly defines all the actions that an animal can take and the outcome of said actions are apparent.
public class Animal {
	
	//The private string containing the name of the animal is a good example of encapsulation because
	//we do not want the name of the animal to change accidentally by an outside function, so keeping it private is important.
	private String animalName;
	
	public Animal(String theanimalName) {
		this.animalName = theanimalName;
	}
	
	public String wakeUp() {
			return(animalName + " the " + this.getClass().getSimpleName() + " wakes up." + "\n");
	}
	
	public String makeNoise() {
		return(animalName + " the " + this.getClass().getSimpleName() + " makes a noise." + "\n");
	}
	
	public String eat() {
		return(animalName + " the " + this.getClass().getSimpleName() + " eats." + "\n");
	}
	
	public String roam() {
		return(animalName + " the " + this.getClass().getSimpleName() + " roams." + "\n");
	}
	
	public String sleep() {
		return(animalName + " the " + this.getClass().getSimpleName() + " sleeps." + "\n");
	}
	
	public String dig() {
		return(animalName + " the " + this.getClass().getSimpleName() + " digs." + "\n");
	}
	
	public String charge() {
		return(animalName + " the " + this.getClass().getSimpleName() + " charges." + "\n");
	}
	

	public String returnName() {
		return(animalName);
	}
	
	public int getRandomNumber(int min, int max) {
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}

}
