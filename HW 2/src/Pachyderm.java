
public class Pachyderm extends Animal {


	public Pachyderm(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
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
