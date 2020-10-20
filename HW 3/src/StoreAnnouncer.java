//Observer that will announce the Store's actions/status.

public class StoreAnnouncer {
	
	//Create a way for the Store Announcer to announce the openings and closings of the store.
	public void announcerStatement(String storeStatus) {
		System.out.println("Hi, this is the Store Announcer. Currently: " + storeStatus);
	}
	
	// Create a way for the store announcer to announce the buying of items and the day
	public void sellStatement(String storeStatus) {
		System.out.print(storeStatus);
	}
}
