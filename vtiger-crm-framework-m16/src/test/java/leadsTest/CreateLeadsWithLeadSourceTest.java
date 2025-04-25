package leadsTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base_utility.BaseClass;
import generic_utility.FileUtility;

public class CreateLeadsWithLeadSourceTest extends BaseClass {
	@Test
	public void createLeadsWithLeadsourceTest() throws IOException, InterruptedException {
		FileUtility fUtil = new FileUtility();

//		Getting data from excel file
		String lastName = fUtil.getDataFromExcelFile("leads", 1, 0);
		String compName = fUtil.getDataFromExcelFile("leads", 1, 1);

//		Create leads with lead source
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.cssSelector("img[title='Create Lead...']")).click();

		WebElement ln = driver.findElement(By.name("lastname"));
		ln.sendKeys(lastName);

		WebElement cn = driver.findElement(By.name("company"));
		cn.sendKeys(compName);

		WebElement ls = driver.findElement(By.name("leadsource"));
		Select selLs = new Select(ls);
		String leadSource = "Partner";
		selLs.selectByValue(leadSource);

//		Save
		driver.findElement(By.cssSelector("input[class='crmButton small save']")).click();

//		Verification
		String actualLastName = driver.findElement(By.id("dtlview_Last Name")).getText();
		Assert.assertEquals(actualLastName, lastName);

		String actualCompName = driver.findElement(By.id("dtlview_Company")).getText();
		Assert.assertEquals(actualCompName, compName);

		String actualLeadSource = driver.findElement(By.id("dtlview_Lead Source")).getText();
		Assert.assertEquals(actualLeadSource, leadSource);
	}
	
}
