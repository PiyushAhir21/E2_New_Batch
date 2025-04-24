package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleOfAssert {

	@Test
	public void add() {
		boolean status1 = true;
		boolean status2 = false;
		
//		Assert.assertTrue(status2);
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(status2);
		
		sa.assertAll();
		
	}
}
