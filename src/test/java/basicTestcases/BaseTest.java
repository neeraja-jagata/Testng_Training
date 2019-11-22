package basicTestcases;

import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	/*@BeforeSuite
	public void setUp() {
		System.out.println("Initialising everythig...!!!!");
	}
	@AfterSuite
	public void tearDown() {
		System.out.println("Quiting everythig...!!!!");
	
	} 
*/
	public static void main(String[] args) {
		
		Date d= new Date();
		System.out.println(d);
		
	}
}
