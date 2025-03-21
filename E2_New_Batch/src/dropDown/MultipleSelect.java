package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("C:\\Users\\User\\git\\E2_new_batch\\E2_New_Batch\\src\\html\\mutliple.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select selCar = new Select(cars);
		Boolean status = selCar.isMultiple();
		System.out.println(status);
		
		selCar.selectByVisibleText("Verna");
		selCar.selectByVisibleText("Fortuner");
		selCar.selectByValue("saab");

		Thread.sleep(2000);
//		selCar.deselectByIndex(0);		
//		selCar.deselectByIndex(1);	
//		selCar.deselectAll();
		
		WebElement firstSelected = selCar.getFirstSelectedOption();
//		System.out.println(firstSelected.getText());
		
		List<WebElement> allSelected = selCar.getAllSelectedOptions();
		for (WebElement selected : allSelected) {
			System.out.println(selected.getText());
		}
	}
}
