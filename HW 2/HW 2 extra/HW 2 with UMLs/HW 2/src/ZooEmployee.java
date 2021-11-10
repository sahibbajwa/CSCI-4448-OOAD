// wake the animals, roll call the animals, feed the animals, tell the animals to sleep, exercise the animals

//ZooEmployee is the abstract class of ZooKeepper.
public abstract class ZooEmployee {
	private String keeperName;
	
	private ZooAnnouncer announcerName;
	
//	//Create a way for the Zoo Announcer to announce what the Zoo Keeper is about to do.
//	public void announcerStatement(String keeperTask) {
//		System.out.println("Hi, this is the Zoo Announcer. The Zookeeper is about to " + keeperTask + "!");
//	}
	
	
	//Add the observer declaring the action in every event.
	//https://www.baeldung.com/java-observer-pattern
	
	//All methods in this class are a good example of identity because each function has its own name that can be called.
	public String wakeAnimals(Animal[] nameList) {
		
		announcerName.announcerStatement("wake up");
		
		 for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " wakes up " + nameList[i].returnName() + " the " + nameList[i].getClass().getName());
			 nameList[i].wakeUp();
		 }
		 
		 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has woken up the animals." + "\n");
		 return(keeperName + " the " + this.getClass().getSimpleName() + " has woken up the animals." + "\n");
	}
	
	public String rollcallAnimals(Animal[] nameList) {
		
		announcerName.announcerStatement("roll call");
		
		for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " calls " + nameList[i].returnName() + " the " + nameList[i].getClass().getName());
			 nameList[i].returnName();
		 }
		
		System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has called roll on the animals." + "\n");
		return(keeperName + " the " + this.getClass().getSimpleName() + " has called roll on the animals." + "\n");
	}
	
	public String feedAnimals(Animal[] nameList) {
		
		announcerName.announcerStatement("feed");
		
		for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " feeds " + nameList[i].returnName() + " the " + nameList[i].getClass().getName());
			 nameList[i].eat();
		}
		
		System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has fed the animals." + "\n");
		return(keeperName + " the " + this.getClass().getSimpleName() + " has fed the animals." + "\n");
	}
	public String sleepAnimals(Animal[] nameList) {
		
		announcerName.announcerStatement("put to sleep");
		
		for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " puts " + nameList[i].returnName() + " the " + nameList[i].getClass().getName() + " to sleep.");
			 nameList[i].sleep();
		 }
		
		System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has put the animals to sleep." + "\n");
		return(keeperName + " the " + this.getClass().getSimpleName() + " has put the animals to sleep." + "\n");
	}
	
	public String exerciseAnimals(Animal[] nameList) {
		
		announcerName.announcerStatement("exercise");
		
		for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " exercises " + nameList[i].returnName() + " the " + nameList[i].getClass().getName());
			 nameList[i].roam();
		 }
		
		System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has exercised the animals." + "\n");
		return(keeperName + " the " + this.getClass().getName() + " has exercised the animals." + "\n");
	}
	
	public ZooEmployee(String thekeeperName) {
		this.keeperName = thekeeperName;
	}
	
	//Methods for the announcer
	public void startOb() {
		announcerName = new ZooAnnouncer();
	}
	
	public void ceaseOb() {
		System.out.println("The Zoo Keeper has no further tasks and everyone is leaving for the day.");
	}
	
	//Methods for the server and server/announcer interactions
	public void makeFood() {
		System.out.println("The Zoo Food Server makes food.");
	}
	
	public void serveFood() {
		System.out.println("The Zoo Food Server serves food.");
	}
	
	public void cleanFood() {
		System.out.println("The Zoo Food server is cleans up food.");
	}
	
	public void lunchTime() {
		System.out.println("Announcement: The Zoo Food Server is now serving lunch.");
	}
	
	public void dinnerTime() {
		System.out.println("Announcement: The Zoo Food Server is now serving dinner.");
	}
	
}
