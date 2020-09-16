
public class Kangaroo extends Marsupials {
	public Kangaroo(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}

	public String makeNoise() {
		System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " makes a noise." + "\n");
		return(this.returnName() + " the " + this.getClass().getSimpleName() + " makes a noise." + "\n");
	}
}