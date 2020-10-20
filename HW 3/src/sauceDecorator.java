// Sauce's Decorator

public class sauceDecorator implements Sauce {
	protected Sauce thesauce;

	public sauceDecorator (Sauce csauce) {
		this.thesauce = csauce;
	}
	@Override
	public void setSauce() {
		this.thesauce.setSauce();
	}
	
}
