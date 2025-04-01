package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.dream11.com/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("About Us")).click();
	}
}
