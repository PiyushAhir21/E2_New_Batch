package leadsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_utility.BaseClass;

public class CreateLeadsTest extends BaseClass {

	@Test
	public void createLeadsTest() throws InterruptedException {

//		Create new lead
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();

		WebElement ln = driver.findElement(By.name("lastname"));
		String lastName = "singh";
		ln.sendKeys(lastName);

		WebElement cn = driver.findElement(By.name("company"));
		String compName = "Parle-G";
		cn.sendKeys(compName);

//		save
		driver.findElement(By.cssSelector("input[class='crmButton small save']")).click();

//		verification
		String actualLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		Assert.assertEquals(actualLastName, lastName);
	}
}
