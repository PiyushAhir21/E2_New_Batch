package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingCommands {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.shoppersstack.com/products_page/18");
		Thread.sleep(60000);
		
		WebElement zip = driver.findElement(By.id("Check Delivery"));
		zip.sendKeys("201301");
		
//		condition
//		element clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement checkbtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		
		
		checkbtn.click();
		
		
		
		
	}
	
}
