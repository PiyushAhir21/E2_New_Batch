package leadsTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base_utility.BaseClass;

public class CreateLeadsWithPhoneTest extends BaseClass {

	@Test
	public void createLeadsWithPhoneTest() throws IOException, InterruptedException {

//		Getting data from excel file
		String lastName = fUtil.getDataFromExcelFile("leads", 1, 0);
		String compName = fUtil.getDataFromExcelFile("leads", 1, 1);
		String phoneNum = fUtil.getDataFromExcelFile("leads", 1, 2);

//		Create leads with phone number
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();

		WebElement ln = driver.findElement(By.name("lastname"));
		ln.sendKeys(lastName);

		WebElement cn = driver.findElement(By.name("company"));
		cn.sendKeys(compName);

		WebElement pn = driver.findElement(By.id("phone"));
		pn.sendKeys(phoneNum);

//		Save
		driver.findElement(By.cssSelector("input[class='crmButton small save']")).click();

//		Verification
		String actualLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		Assert.assertTrue(actualLastName.equals(lastName));

		String actualCompName = driver.findElement(By.id("dtlview_Company")).getText();
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualCompName.equals(compName));
		
		String actualPhonNum = driver.findElement(By.id("dtlview_Phone")).getText();
		Assert.assertTrue(actualPhonNum.equals(phoneNum));

	}
}
