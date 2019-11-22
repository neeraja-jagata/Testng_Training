package basicTestcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 extends BaseTest  {

	 
	  /*@BeforeTest 
	  public void openDBConn(){
	  System.out.println("Open DB connection"); }
	  @AfterTest 
	  public void closeDBConn(){
	  System.out.println("close DB connection"); }*/
	 
	/*
	 * @BeforeMethod
	 *  public void launchBrowser() {
	 * System.out.println("Launch Browser"); }
	 * @AfterMethod
	 *  public void closeBrowser() {
	 * System.out.println("close Browser"); }
	 */

	@Test(priority = 1, groups = { "bvt", "functional", "sanity", "smoke" })
	public void verifyTitle() throws Exception {
		System.out.println("In verifyTitle");
		String expectedTitle = "yahoo";// from excel
		String actualTitle = "gmail";// from se get title
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Testcase passed");
		} else {
			System.out.println("Test case failed------- Titles not matched");
			// throw new Exception();
			 Assert.assertTrue(false, "Title does not match");
			//Assert.assert

		}
	}

	@Test(priority = 1, groups = { "functional", "regression" })
	public void verifyRegPage() {
		System.out.println("In verifyRegPage");
		SoftAssert softAssert = new SoftAssert();

		System.out.println("validating image");
		softAssert.assertTrue(false, "Image not present");
		System.out.println("validating Text box");
		softAssert.assertTrue(false, "Textbox not present");
		System.out.println("validating some buttons");
		softAssert.assertTrue(false, "buttons not present");

		softAssert.assertAll();

	}

	//@Test(priority = 1, dependsOnMethods = "verifyRegPage", groups = { "functional", "regression" })
	@Test(priority = 3,  groups = { "functional", "regression" })
	public void doUserReg() {
		System.out.println("Do user regestration");
	}

	//@Test(priority = 2, dependsOnMethods = "doUserReg", groups = { "bvt", "functional", "sanity", "smoke",
	//		"regression" })
	@Test(priority = 4, groups = { "bvt", "functional", "sanity", "smoke",
	"regression" })
	public void doLogin() {
		System.out.println("User Login");
	}

}
