package multiple_object_extraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC_NewsChannel {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bbc.com");
		//driver.findElement(By.xpath("//span[@id='idcta-username']")).click();
		//System.out.println("The title of the landing page :"+driver.getTitle());
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		//number of links 
		System.out.println("Total number of links :" + allLinks.size());
		 WebElement anyLink = allLinks.get(101);
		 System.out.println("Name or text of a particular link is :"+ anyLink.getText());
		 System.out.println("url associated with this link is :"+ anyLink.getAttribute("href"));
		 System.out.println("x co-ordinate is : "+ anyLink.getLocation().x +
				 "and Y co-ordinate is :"+ anyLink.getLocation().y);
		 //anyLink.click();
		 //System.out.println("Title of the page is : "+ driver.getTitle());
		// driver.navigate().back();
		// Thread.sleep(2000);
		 for(int i=0; i<allLinks.size(); i++) {
			 WebElement TotalLinks = allLinks.get(i);
			 System.out.println(TotalLinks.getText()+"--------------"+TotalLinks.isDisplayed());
		 }
		driver.quit();
		

	}

}
