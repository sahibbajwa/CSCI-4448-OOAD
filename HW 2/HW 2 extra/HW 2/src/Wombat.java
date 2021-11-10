// Add a way for Wombats to make a new noise.

public class Wombat extends Marsupials {
	public Wombat(String theanimalName, MarsNoise marsNoise) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}

	public String makeNoise() {
		System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " rmakes a noise." + "\n");
		return(this.returnName() + " the " + this.getClass().getSimpleName() + " rmakes a noise." + "\n");
	}
}
