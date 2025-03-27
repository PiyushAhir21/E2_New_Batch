package Actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

//		Actions act = new Actions(driver);
//		act.sendKeys("admin").build().perform();
//		act.keyDown(Keys.TAB).perform();
//		act.keyUp(Keys.TAB).perform();
//		act.sendKeys("password").perform();
//		act.keyDown(Keys.ENTER).perform();
//		act.keyUp(Keys.ENTER).perform();

		Actions act =new Actions(driver);
				act.sendKeys("admin")
				.keyDown(Keys.TAB)
				.keyUp(Keys.TAB)
				.sendKeys("password")
				.keyDown(Keys.ENTER)
				.keyUp(Keys.ENTER).build().perform();
		
				
				
	}
}
