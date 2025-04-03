package Handling_Js_alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_popUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("file:///C:/Users/User/git/E2_new_batch/E2_New_Batch/src/Handling_alerts/confirmationPopup.html");
				
		driver.findElement(By.xpath("//button[text()='Try it for prompt']")).click();
		Thread.sleep(1000);

		Alert ale = driver.switchTo().alert();
		ale.sendKeys("Shivmani");
		String textOfAlert = ale.getText();
		System.out.println(textOfAlert);
		ale.accept();
		

		
		Thread.sleep(5000);
		driver.close();
	}
}
