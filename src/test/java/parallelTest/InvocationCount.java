package parallelTest;

import org.testng.annotations.Test;

public class InvocationCount extends BaseTest{
	
	@Test(invocationCount=3,threadPoolSize=3)
	public void executeTest() {
		
		driver=getDriver("chrome");
		driver.get("http://google.com");
		driver.close();
	}

}
