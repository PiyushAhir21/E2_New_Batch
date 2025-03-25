package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.youtube.com/");
		
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("Automation");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.ENTER).perform();
		act.keyUp(Keys.ENTER).perform();
		
		driver.findElement(By.xpath("//*[local-name()='yt-formatted-string' and text()='The Rise of the Machines – Why Automation is Different this Time']")).click();
		
	}
}
