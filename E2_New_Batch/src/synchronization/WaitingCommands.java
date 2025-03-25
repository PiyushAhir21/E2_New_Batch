package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

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
//		element clickable via WebDriverWait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		WebElement checkbtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));

//		Fluent wait -> polling time can be changed
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Check")));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);

//		checkbtn.click();

//		developing multiple methods in the same class with 
//		the same name but difference in the arguments list
		
		
	}

}
