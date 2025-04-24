package leadsTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic_utility.FileUtility;
import generic_utility.WebDriverUtility;
import object_repository.LoginPage;

public class CreateLeadsWithLeadSourceTest extends BaseClass {

	@Test
	public void createLeadsWithLeadsourceTest() throws IOException, InterruptedException {
		FileUtility fUtil = new FileUtility();
		
//		getting data from properties file		
		String BROWSER = fUtil.getDataFromPropertyFile("bro");
		String URL = fUtil.getDataFromPropertyFile("url");
		String USERNAME = fUtil.getDataFromPropertyFile("un");
		String PASSWORD = fUtil.getDataFromPropertyFile("pwd");

//		Getting data from excel file
		String lastName = fUtil.getDataFromExcelFile("leads", 1, 0);
		String compName = fUtil.getDataFromExcelFile("leads", 1, 1);

		
//		Login
		LoginPage lp = new LoginPage(driver);
		lp.login(USERNAME, PASSWORD);

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
		if (actualLastName.equals(lastName)) {
			System.out.println("Entered lastname successfully!!!");
		}

		String actualCompName = driver.findElement(By.id("dtlview_Company")).getText();
		if (actualCompName.equals(compName)) {
			System.out.println("Entered company name successfully!!!");
		}

		String actualLeadSource = driver.findElement(By.id("dtlview_Lead Source")).getText();
		if (actualLeadSource.equals(leadSource)) {
			System.out.println("Entered lead source successfully !!!");
		}

//		Logout
//		hover on profile
		WebElement profile = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));

//		Actions act = new Actions(driver);
//		act.moveToElement(profile).build().perform();
		WebDriverUtility wdUtil = new WebDriverUtility(driver);
		wdUtil.hover(profile);

		driver.findElement(By.linkText("Sign Out")).click();

		Thread.sleep(2000);
		driver.close();
	}
}
