
public class Marsupials extends Animal {
	public Marsupials(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}

	public String roam() {
		System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " roams." + "\n");
		return(this.returnName() + " the " + this.getClass().getSimpleName() + " roams." + "\n");
	}
}
