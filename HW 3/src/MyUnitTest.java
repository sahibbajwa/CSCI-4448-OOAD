import org.junit.Test;
import static org.junit.Assert.*;

import java.io.PrintStream;

// http://tutorials.jenkov.com/java-unit-testing/simple-test.html

public class MyUnitTest {
	
	@Test
	public void testcustomerType() {
		
		Customer newcustomer = new casualCustomer();
		String result = newcustomer.customerType();
		
		assertEquals("casualCustomer" , result);
		System.out.println("We can create a casual customer successfully");
	}
	
	@Test
	public void testcustomerCreator() {
		
		Customer newcustomer2 = new casualCustomer();
		String result = newcustomer2.customerCreater();
		
		assertEquals("springRoll", result);
		System.out.println("A customer can purchase a spring roll successfully.");
	}

}
