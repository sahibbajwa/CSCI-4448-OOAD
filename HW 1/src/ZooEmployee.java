// wake the animals, roll call the animals, feed the animals, tell the animals to sleep, exercise the animals


//ZooEmployee is the abstract class of ZooKeepper.
public abstract class ZooEmployee {
	private String keeperName;
	
	//All methods in this class are a good example of identity because each function has its own name that can be called.
	public String wakeAnimals(Animal[] nameList) {
		 for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " wakes up " + nameList[i].returnName() + " the " + nameList[i].getClass().getName());
			 nameList[i].wakeUp();
		 }
		 
		 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has woken up the animals." + "\n");
		 return(keeperName + " the " + this.getClass().getSimpleName() + " has woken up the animals." + "\n");
	}
	
	public String rollcallAnimals(Animal[] nameList) {
		for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " calls " + nameList[i].returnName() + " the " + nameList[i].getClass().getName());
			 nameList[i].returnName();
		 }
		
		System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has called roll on the animals." + "\n");
		return(keeperName + " the " + this.getClass().getSimpleName() + " has called roll on the animals." + "\n");
	}
	
	public String feedAnimals(Animal[] nameList) {
		for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " feeds " + nameList[i].returnName() + " the " + nameList[i].getClass().getName());
			 nameList[i].eat();
		}
		
		System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has fed the animals." + "\n");
		return(keeperName + " the " + this.getClass().getSimpleName() + " has fed the animals." + "\n");
	}
	public String sleepAnimals(Animal[] nameList) {
		for(int i = 0; i < nameList.length; i = i + 1) {
			 System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " puts " + nameList[i].returnName() + " the " + nameList[i].getClass().getName() + " to sleep.");
			 nameList[i].sleep();
		 }
		
		System.out.println(keeperName + " the " + this.getClass().getSimpleName() + " has put the animals to sleep." + "\n");
		return(keeperName + " the " + this.getClass().getSimpleName() + " has put the animals to sleep." + "\n");
	}
	
	public String exerciseAnimals(Animal[] nameList) {
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
}
