package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement Norway = driver.findElement(By.id("box101"));

		WebElement stockHolm = driver.findElement(By.id("box2"));
		WebElement Sweden = driver.findElement(By.id("box102"));

		WebElement washington = driver.findElement(By.id("box3"));
		WebElement US = driver.findElement(By.id("box103"));

		Actions act = new Actions(driver);
//		act.dragAndDrop(oslo, Norway).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(stockHolm, Sweden).build().perform();
//		Thread.sleep(1000);
		act.dragAndDropBy(washington, 100, 0).perform();
		
		
		
//		Thread.sleep(2000);
//		driver.close();
	}
}
