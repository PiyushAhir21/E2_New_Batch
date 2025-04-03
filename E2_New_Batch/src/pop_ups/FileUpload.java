package pop_ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//p[contains(text(),'experience')]")).click();
		
		WebElement resumeInput = driver.findElement(By.id("resumeUpload"));
		resumeInput.sendKeys("C:\\Users\\User\\Desktop\\anish_resume.pdf");
		
		Thread.sleep(10000);
		driver.close();
	}
}
