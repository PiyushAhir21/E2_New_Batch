package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class WebPage {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://facebook.com/");
		
//		Taking the ss of a webpage
		TakesScreenshot tks = (TakesScreenshot) driver;
		File src = tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User\\git\\E2_new_batch\\E2_New_Batch\\src\\errorShots/ss2.png");
		FileHandler.copy(src, dest);
		
//		Taking the ss of a webelement 
		WebElement formSS = driver.findElement(By.xpath("//input[@name='email']/../../.."));
		File src1 = formSS.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\User\\git\\E2_new_batch\\E2_New_Batch\\src\\errorShots/ss3.png");
		FileHandler.copy(src1, dest1);
		
		driver.close();
	}
}
