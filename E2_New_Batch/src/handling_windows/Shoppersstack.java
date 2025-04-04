package handling_windows;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://shoppersstack.com/products_page/18");

//		Step : 1 - get the address or session id of Parent
		String ParentID = driver.getWindowHandle();

		Thread.sleep(2000);
//		Step : 2 - Perform task which will open new child windows
		WebElement compareBtn = driver.findElement(By.id("compare"));
		compareBtn.click();

		String expUrl = "https://www.flipkart.com/";

//		Step : 3 - Collect all the session ids 
		Set<String> IDs = driver.getWindowHandles();
		IDs.remove(ParentID);

//		Step : 4 - Iterate through all the session ids
		for (String id : IDs) {
			driver.switchTo().window(id);
//			Break the loop based on the requirements
			if (driver.getCurrentUrl().equals(expUrl)) {
				break;
			} else {
				System.out.println("it is : " + driver.getCurrentUrl() + " so we are going to...");
			}
		}
		Thread.sleep(1000);

//		Step 5 : Perform the tasks in child window
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();

		Thread.sleep(2000);

//		Step 6 : Come back to the parent window
		driver.switchTo().window(ParentID);

		Thread.sleep(2000);
		driver.quit();

	}
}
