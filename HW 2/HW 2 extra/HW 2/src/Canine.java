
public class Canine extends Animal {
	public Canine(String theanimalName) {
		super(theanimalName);
		// TODO Auto-generated constructor stub
	}

	public String roam() {
		System.out.println(this.returnName() + " the " + this.getClass().getSimpleName() + " eats." + "\n");
		return(this.returnName() + " the " + this.getClass().getSimpleName() + " eats." + "\n");
	}
}
