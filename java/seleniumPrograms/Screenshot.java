package seleniumPrograms;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
@Test
 
public class Screenshot {
 
     public static void main(String[] args) throws IOException {
     // TODO Auto-generated method stub
 
     WebDriver drv = new ChromeDriver();
     
     drv.manage().window().maximize();        //always write wait code after this
    // drv.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);//for page load
     drv.get("https://opensource-demo.orangehrmlive.com/");         //Testing webpage
    // drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //for Implicit wait
         
     //Capturing the screenshot
 
     File f = ((TakesScreenshot) drv).getScreenshotAs(OutputType.FILE);
     FileUtils.copyFile(f, new File("C:\\Users\\Shumson Nahar\\Pictures\\Screenshots\\screenshots.png"));
 
      //screenshot copied from buffer is saved at the mentioned path.
 
     System.out.println("The Screenshot is captured.");
         
        }
}