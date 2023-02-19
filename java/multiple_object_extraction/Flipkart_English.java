package multiple_object_extraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_English {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_7e6e831e-1ba7-4fe8-b4e4-2e63f5b0edae_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C4");
	   List<WebElement>AllShirtBrandNames= driver.findElements(By.xpath("//div[@class=\"_2WkVRV\"]"));
	   System.out.println("total T Shirts:"+AllShirtBrandNames.size());
	   System.out.println("-----------------------------------");
	   
		/*
		 * for(WebElement e :AllShirtBrandNames) { System.out.println(e.getText()); }
		 */
	   List<WebElement>AllTShirtNameTypes = driver.findElements(By.xpath("//a[@class=\"IRpwTa\"]"));
	   System.out.println("total types of T Shirt names are :"+AllTShirtNameTypes.size());
	   System.out.println("--------------------------------------");
	   
		/*
		 * for(WebElement e :AllTShirtNameTypes) { System.out.println(e.getText()); }
		 */
	   List<WebElement>TShirtPrices=driver.findElements(By.xpath("//div[@class=\"_30jeq3\"]"));
	   System.out.println("total number of T Shirt is:"+TShirtPrices.size());
		/*
		 * for(WebElement e :TShirtPrices ) { System.out.println(e.getText()); }
		 */
	   for(int i=0;i<AllShirtBrandNames.size();i++) {
		   System.out.println(AllShirtBrandNames.get(i).getText()+"----------"+AllTShirtNameTypes.get(i).getText()+
				   "---------"+TShirtPrices.get(i).getText());
		  
		   
	   }
	

}
}