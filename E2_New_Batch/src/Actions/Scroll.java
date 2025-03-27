package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.zomato.com/");
		
		WebElement element = driver.findElement(By.linkText("Apps For You"));
		
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 1000).build().perform();
		act.scrollToElement(element).build().perform();
		
	}
}
