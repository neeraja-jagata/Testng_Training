package gridTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTestParamsXML {
	
	public WebDriver driver;
	public DesiredCapabilities cap=new DesiredCapabilities();
	
	@Parameters({"browser"})
	@Test
	public void browserLaunchGrid(String browser) throws MalformedURLException {
		
		if(browser.equalsIgnoreCase("chrome")) {
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			ChromeOptions options=new ChromeOptions();
			options.merge(cap);			
		}else if (browser.equalsIgnoreCase("firefox")) {
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.ANY);
			FirefoxOptions options=new FirefoxOptions();
			options.merge(cap);
		}
		
		
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap );
		System.out.println(browser+ "   "+ "browserLaunchGrid");
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("identifierId")).sendKeys("neeraja.jagata@gmail.com"+Keys.ENTER);
		driver.close();
		
		
	}
	
	

}
