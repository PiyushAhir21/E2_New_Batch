package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frames {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		WebElement frame = driver.findElement(By.name("iframeResult"));
		
		driver.switchTo().frame(0);

		WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		submitBtn.click();
	}
}
