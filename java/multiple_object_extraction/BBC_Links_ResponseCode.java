package multiple_object_extraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BBC_Links_ResponseCode {
	public static WebDriver driver;
	@Test
	public void bbcTopLinks() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
	List<WebElement> topLinks = driver.findElements(By.xpath("//*[@id=\"orb-header\"]/div/nav[2]/ul/li/a"));
		System.out.println("total top links in BBC home page are :"+topLinks.size());
		
		for(int i=0; i<topLinks.size(); i++) {
			System.out.println(topLinks.get(i).getText()+"presrnce of this link is :"+topLinks.get(i).isDisplayed());
			String url = topLinks.get(i).getAttribute("href");
			System.out.println(url);
			System.out.println("---------------------------------");
			
			
		}
	}

}
