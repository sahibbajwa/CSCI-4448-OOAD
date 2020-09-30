//The feline class is a good example of polymorphism because it is an extension of Animal, but can overwrite the
//methods/behaviors it obtained from Animal. Feline is also conisdered an animal because it is an extension of Animal.

public class Feline extends Animal {
	
	public Feline(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}

	public String sleep() {
		
		int chance = getRandomNumber(0, 100);
		
		if(chance < 30) {
			System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " roams." + "\n");
			return(this.returnName() + " the " + this.getClass().getSimpleName() + " roams." + "\n");
		}
		
		else if(chance >= 30 && chance < 60) {
			System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " rmakes a noise." + "\n");
			return(this.returnName() + " the " + this.getClass().getSimpleName() + " rmakes a noise." + "\n");
		}
		
		else {
			System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " sleeps." + "\n");
			return(this.returnName() + " the " + this.getClass().getSimpleName() + " sleeps." + "\n");
		}

	}

}