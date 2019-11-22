package listenersTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GmailTest extends TestBase {

	@BeforeClass
	public void launchWebsite() {
		System.out.println("launching gmail Website");
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void doLogin(){
		driver.findElement(By.id("identifierId")).sendKeys("neeraja.jagata@gmail.com"+Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("xjfxx"+Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Gmail"));
	}
	@Test(priority=2, dependsOnMethods="doLogin")
	public void composeMail() {
		driver.findElement(By.xpath("//div[(.='Compose')][(@role='button')]")).click();
		
	}
	
	@Test(priority=3/*, dependsOnMethods="doLogin()"*/)
	public void signOut() {
		driver.findElement(By.xpath("//span[(@class='gb_xa gbii')]")).click();
		driver.findElement(By.xpath("//a[(.='Sign out')]")).click();
	}
}
