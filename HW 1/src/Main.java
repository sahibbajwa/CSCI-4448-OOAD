// Sahib Bajwa

//https://www.inf.unibz.it/~calvanese/teaching/06-07-ip/lecture-notes/uni02/node33.html#:~:text=The%20simplest%20one%20is%20to,new%20Scanner(System.in)%3B
//https://www.tutorialspoint.com/redirecting-system-out-println-output-to-a-file-in-java#:~:text=Instantiate%20a%20PrintStream%20class%20by,created%20in%20the%20first%20step.

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
	private static int runLength = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		
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
		Kangaroo kevin = new Kangaroo("Kevin");
		Kangaroo kylie = new Kangaroo("Kylie");
		Wombat wyatt = new Wombat("Wyatt");
		Wombat wiebke = new Wombat("Wiebke");
		
		
		Animal[] nameList = {harry, henery, eric, eva, ronald, rachel, tony, taylor, larry, lauren, charlie, chloe, warren, willow, darren, daniel, kevin, kylie, wyatt, wiebke};
		
		ZooKeeper zoey = new ZooKeeper("Zoey");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many days? ");
		runLength = scanner.nextInt();
		scanner.close();
		
		
		PrintStream output = new PrintStream("dayatthezoo.out");
		System.setOut(output);
		
		for(int i = 1; i <= runLength; i = i + 1) {
			System.out.println("The Zookeeper arrives at the Zoo on Day #" + i);
			System.out.println(" ");
			
			zoey.wakeAnimals(nameList);
			zoey.rollcallAnimals(nameList);
			zoey.feedAnimals(nameList);
			zoey.exerciseAnimals(nameList);
			zoey.sleepAnimals(nameList);
			
			System.out.println("The Zookeeper leaves the Zoo on Day #" + i);
			System.out.println(" ");
			
		}
	}
	
	
}
	
