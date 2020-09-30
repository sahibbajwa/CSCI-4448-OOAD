
public class Hippo extends Pachyderm {
	
	public Hippo(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}

	public String makeNoise() {
		System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " makes a noise." + "\n");
		return(this.returnName() + " the " + this.getClass().getSimpleName() + " makes a noise." + "\n");
	}
	
	public String roam() {
		
		int chance = getRandomNumber(0, 100);
		
		if(chance < 25) {
			System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " charges." + "\n");
			return(this.returnName() + " the " + this.getClass().getSimpleName() + " charges." + "\n");
		}
		
		else {
			System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " roams." + "\n");
			return(this.returnName() + " the " + this.getClass().getSimpleName() + " roams." + "\n");
		}

	}

}
