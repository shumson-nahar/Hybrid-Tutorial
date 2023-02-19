package seleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_rediff {

	
		public static WebDriver driver;
		
		
	    public static void main(String[] args) throws InterruptedException, IOException
	    {
	       
	       driver = new ChromeDriver();
	        driver.get("https://rediff.com");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//a[@class='signin']")).click();
	 
	    
	 
	    
	        // Creating instance of File
	        File File = ((TakesScreenshot)driver)
	                        .getScreenshotAs(OutputType.FILE);
	 
	        FileUtils.copyFile(File,
	                    new File("C:\\Users\\Shumson Nahar\\Downloads\\sample\\rediffScreenshot.png"));
	    
	 
	   
	           
	        System.out.println("screenshot captured");
	        driver.quit();
	    }
}
	

	


