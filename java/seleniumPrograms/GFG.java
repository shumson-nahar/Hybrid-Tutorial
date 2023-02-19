package seleniumPrograms;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
class GFG {
	public static WebDriver driver;
	
	
    public static void main(String[] args) throws InterruptedException, IOException
    {
       
       driver = new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.manage().window().maximize();
 
        WebElement Element = driver.findElement(
            By.xpath("//input[@name='q']"));
 
        // Assignments to webDriver
        MakeBorder(Element);
        Thread.sleep(2000);
        //TakeScreenshot("GooglePage");
       // driver.quit();
    }
 
    // Function to Take screenshot
    public static void TakeScreenshot(String FileName)
        throws IOException
    {
        // Creating instance of File
        File File = ((TakesScreenshot)driver)
                        .getScreenshotAs(OutputType.FILE);
 
        FileUtils.copyFile(File,
                    new File("C:\\Users\\Shumson Nahar\\Downloads\\sample\\googleScreenshot.png"));
    }
 
    // Function to Make border
    public static void MakeBorder(WebElement Element)
    {
 
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript( "arguments[0].style.border = '3px solid blue'", Element);
               
           
        System.out.println("screenshot captured");
    }
}
