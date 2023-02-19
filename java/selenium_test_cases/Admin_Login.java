package selenium_test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Admin_Login {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	@Test
	public void verifyLaunchApp() {
		
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		//Assert.assertEquals(pageTitle, "  Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	}
	@Test
	public void verifElements() {
		boolean ele1=driver.findElement(By.)
		
	}

}
