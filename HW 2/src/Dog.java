
public class Dog extends Canine {

	public Dog(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}
	
	public String roam() {
		
		int chance = getRandomNumber(0, 100);
		
		if(chance < 25) {
			System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " digs." + "\n");
			return(this.returnName() + " the " + this.getClass().getSimpleName() + " digs." + "\n");
		}
		
		else {
			System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " roams." + "\n");
			return(this.returnName() + " the " + this.getClass().getSimpleName() + " roams." + "\n");
		}
	}

}
