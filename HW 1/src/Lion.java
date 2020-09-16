
public class Lion extends Feline {
	public Lion(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}

	public String makeNoise() {
		System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " makes a noise." + "\n");
		return(this.returnName() + " the " + this.getClass().getSimpleName() + " makes a noise." + "\n");
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
