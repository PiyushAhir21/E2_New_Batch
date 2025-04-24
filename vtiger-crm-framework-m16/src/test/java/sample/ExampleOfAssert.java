package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleOfAssert {

	@Test
	public void add() {

		String a = "abc";
		String b = "abc";
		String c = "xyz";
		Assert.assertEquals(a, b);
		Assert.assertNotEquals(a, c);

		Object obj = null ;
		Object obj1 = new Object();
		Assert.assertNull(obj);
		Assert.assertNotNull(obj1);

		boolean status1 = true;
		boolean status2 = false;
		Assert.assertTrue(status1);
		Assert.assertFalse(status2);
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		sa.assertNotEquals(a, c);

		sa.assertNull(obj1); // exception 
		sa.assertNotNull(obj1);

		sa.assertTrue(status1);
		sa.assertFalse(status2);

	}
}
