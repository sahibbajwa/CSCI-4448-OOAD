
public class Wolf extends Canine {

	public Wolf(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}
	
	public String makeNoise() {
		System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " rmakes a noise." + "\n");
		return(this.returnName() + " the " + this.getClass().getSimpleName() + " rmakes a noise." + "\n");
	}

}
