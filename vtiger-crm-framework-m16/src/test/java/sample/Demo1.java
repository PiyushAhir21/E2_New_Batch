package sample;

import org.testng.annotations.Test;

import leadsTest.BaseClass;

public class Demo1 extends BaseClass {

	@Test
	public void add() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("This is add method...");
	}
	
}
