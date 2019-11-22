package parallelTest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelTestWithDataProviders extends BaseTest {
	
	@Test(dataProvider="getBrowserData" )
	public void doParallelTest(String browser) {
		Date d =new Date();
		System.out.println(browser +"---"+ d);
		
		driver=getDriver(browser);
		driver.get("http://google.com");
		driver.close();
		
	}

	@DataProvider(parallel=true)
	public Object[][] getBrowserData(){
		Object[][] d= new Object[2][1];
		d[0][0]="Chrome";
		d[1][0]="firefox";
		
		return d;
	}
}
