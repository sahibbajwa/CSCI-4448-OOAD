//Create the clock for the keeper to abide by.

public class ZooClock {
	private int clock = 8;
	
	public int announceTime() {
		return this.clock;
	}
	
	public void incrementTime() {
		this.clock = this.clock + 1;
	}
	
	public void endTime() {
		this.clock = 8;
	}
}
