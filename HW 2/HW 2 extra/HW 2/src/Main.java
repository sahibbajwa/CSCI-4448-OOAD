// Sahib Bajwa

//https://www.inf.unibz.it/~calvanese/teaching/06-07-ip/lecture-notes/uni02/node33.html#:~:text=The%20simplest%20one%20is%20to,new%20Scanner(System.in)%3B
//https://www.tutorialspoint.com/redirecting-system-out-println-output-to-a-file-in-java#:~:text=Instantiate%20a%20PrintStream%20class%20by,created%20in%20the%20first%20step.

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
	private static int runLength = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		// For delegation, we are going to create a new way for an animal to make a noise.
		// We are going to create a new way for the marsupials to make noise.
		
		Hippo harry = new Hippo("Harry");
		Hippo henery = new Hippo("Henery");
		Elephant eric = new Elephant("Eric");
		Elephant eva = new Elephant("Eva");
		Rhino ronald = new Rhino("Rondald");
		Rhino rachel = new Rhino("Rachel");
		
		Tiger tony = new Tiger("Tony");
		Tiger taylor = new Tiger("Taylor");
		Lion larry = new Lion("Larry");
		Lion lauren = new Lion("Lauren");
		Cat charlie = new Cat("Charlie");
		Cat chloe = new Cat("chloe");
		
		Wolf warren = new Wolf("Warren");
		Wolf willow = new Wolf("Willow");
		Dog darren = new Dog("Darren");
		Dog daniel = new Dog("Daniel");
		
		
		// Adding the new noise to the marsupials.
		Kangaroo kevin = new Kangaroo("Kevin", new MarsNoise());
		Kangaroo kylie = new Kangaroo("Kylie", new MarsNoise());
		Wombat wyatt = new Wombat("Wyatt", new MarsNoise());
		Wombat wiebke = new Wombat("Wiebke", new MarsNoise());
		
		
		Animal[] nameList = {harry, henery, eric, eva, ronald, rachel, tony, taylor, larry, lauren, charlie, chloe, warren, willow, darren, daniel, kevin, kylie, wyatt, wiebke};
		
		ZooKeeper zoey = new ZooKeeper("Zoey");
		
		//Create the clock for the Zoo Keeper to abide by.
		ZooClock clock = new ZooClock();
		
		//Create the Zoo Food Server
		ZooFoodServer foodServer = new ZooFoodServer("Rex");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many days? ");
		runLength = scanner.nextInt();
		scanner.close();
		
		
		PrintStream output = new PrintStream("dayatthezoo.out");
		System.setOut(output);
		
		for(int i = 1; i <= runLength; i = i + 1) {
			System.out.println("The Zookeeper arrives at the Zoo on Day #" + i);
			System.out.println("The Zoo Food Server arrives for the day.");
			System.out.println(" ");
				
			//Announce the time of the day in hour increments and whenever the Zoo Keeper performes an action.
			for (int x = 0; x <= 12; x = x + 1) {
				int dayTime = clock.announceTime();
				
				//create a string for what the time will be and to update the time if over 12.
				String updatedTime;
				
				if (dayTime > 12) {
					updatedTime = (dayTime - 12) + " PM";
				}
				
				else if (dayTime == 12) {
					updatedTime = dayTime + " PM";
				}
				
				else {
					updatedTime = dayTime + " AM";
				}
				
				System.out.println("The time is:" + updatedTime);
				
				
				//Create cases for what the Zoo Keeper, Zoo Food Server, and Zoo Announcer will do at what time each day.
				//https://www.w3schools.com/java/java_switch.asp
				switch(updatedTime) {
				case "8 AM":
					zoey.startOb();
					System.out.println();
					break;
				
				case "10 AM":
					zoey.wakeAnimals(nameList);
					foodServer.makeFood();
					System.out.println();
					break;
				
				case "12 PM":
					zoey.feedAnimals(nameList);
					foodServer.lunchTime();
					foodServer.serveFood();
					System.out.println();
					break;
					
				case "2 PM":
					zoey.exerciseAnimals(nameList);
					foodServer.cleanFood();
					System.out.println();
					break;
					
				case "3 PM":
					foodServer.makeFood();
					System.out.println();
					break;
					
				case "5 PM":
					zoey.sleepAnimals(nameList);
					foodServer.dinnerTime();
					foodServer.serveFood();
					System.out.println();
					break;
					
				case "6 PM":
					foodServer.cleanFood();
					System.out.println();
					break;
					
				case "8 PM":
					zoey.ceaseOb();
					System.out.println();
					break;
					
				default:
					break;
				}
				
				//Increment the time to the next hour.
				clock.incrementTime();
				
				System.out.println();
				
//				zoey.wakeAnimals(nameList);
//				zoey.rollcallAnimals(nameList);
//				zoey.feedAnimals(nameList);
//				zoey.exerciseAnimals(nameList);
//				zoey.sleepAnimals(nameList);
//				zoey.ceaseOb();
				
			}
			
			System.out.println("The Zoo Food Server leaves for the day.");
			System.out.println("The Zookeeper leaves the Zoo on Day #" + i);
			System.out.println(" ");
			clock.endTime();
		}
	}
	
	
}
	
