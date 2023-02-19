package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ducoment {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://rediff.com");
		driver.manage().window().maximize();
		/*
		 * String document = driver.getPageSource();
		 * System.out.println("The document of webpage :"+ document);
		 * 
		 */
		WebElement document_webpage = driver.findElement(By.tagName("body"));
		System.out.println("Document context is :"+ document_webpage.getText());
		driver.quit();

	}

}
