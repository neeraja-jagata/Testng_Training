package parallelTest;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestBrowser extends BaseTest {
	
	@Parameters({"browser"})
	@Test
	public void getBrowser(String browser) {
		Date d =new Date();
		System.out.println(browser +"---"+ d);
		
		driver=getDriver(browser);
		driver.get("http://google.com");
		driver.close();
		
	}

}
