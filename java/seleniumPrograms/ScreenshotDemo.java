package seleniumPrograms;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {
    public static void main(String[] args) {
       
        
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        
        //navigate to url
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();
        
       //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File
            		("C:\\Users\\Shumson Nahar\\Downloads\\sample\\demoqaScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("screenshot captured");
        }
        
        //closing the webdriver
        driver.close();
    }
}
