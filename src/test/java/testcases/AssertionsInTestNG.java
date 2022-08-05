package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
   
	@Test(enabled=false)
	public void testAssertions() {
		int i = 10;

		Assert.assertEquals(i, 20);
		Assert.assertNotEquals(10, 20);
		System.out.println("This is test case 1");
	}

	@Test
	public void testAssertions1() {
		int j = 20;
		Assert.assertTrue(j == 10);
		Assert.assertFalse(false);
		System.out.println("This is test case 1");
	}

}
