package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.amazon.in/");
				
		WebElement location = driver.findElement(By.id("glow-ingress-block"));
		WebElement sign_in = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		Actions act = new Actions(driver);
//		click()
//		act.click(location).perform();
		
//		hover
//		act.moveToElement(sign_in).build().perform();
		
//		Right click
//		act.contextClick().perform();
//		act.contextClick(sign_in).perform();
		
//		click and hold
		
	}
}
