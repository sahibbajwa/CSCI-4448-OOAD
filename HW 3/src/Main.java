import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	private static int runLength = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// Re-Used From Last Project
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many days? ");
		runLength = scanner.nextInt();
		scanner.close();
		
		// Re-Used From Last Project
		// 30 days.
		PrintStream output = new PrintStream("30 Days Store.txt");
		System.setOut(output);
		
		// Create the observer that will announce the store's actions/status.
		StoreAnnouncer observer = new StoreAnnouncer();
		
		
		// Unit Tests
		System.out.println("JUnit Tests:");
		MyUnitTest testitem = new MyUnitTest();
		testitem.testcustomerType();
		testitem.testcustomerCreator();
		System.out.println("End of JUnit Tests. \n");
		
		
		
		// For loop that will run through the specified amount of days.
		for (int i = 1; i <= runLength; i++) {
			
			// Create the amount of customers that will come to the store for the day
			int customerCount = getRandomNumber(1, 12);
			
			// Observer states what day it is.
			observer.sellStatement("Day #: " + i);
			System.out.println("\n");
			
			
			// Observer starts the day.
			observer.announcerStatement("The store opens and has a full inventory.");
			
			// Run through the random amount of customers and get their order.
			for (int j = 1; j <= customerCount; j++) {
	
				observer.sellStatement("A " + Customer.customerType() + " buys a " + Customer.customerCreater() + " with");
				Sauce newsauce = new hotSauce(new SauceImpl());
				newsauce.setSauce();
				System.out.print("\n");

			}
			
			// Observer ends the day.
			observer.announcerStatement("The store has served " + customerCount + " customers and is now closed.");
			System.out.println("");
			
		}
	}

	//https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
	public static int getRandomNumber(int min, int max) {
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		return randomNum;
	}
	
}
