package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class SoftAssert {

	org.testng.asserts.SoftAssert assert1;
	@Test
	public void testAssertions() {
		int i = 10;
		assert1 = new org.testng.asserts.SoftAssert();
		assert1.assertEquals(i, 20);
		assert1.assertNotEquals(10, 20);
		System.out.println("This is test case 1");
	}

	@Test
	public void testAssertions1() {
		int j = 20;
		assert1.assertTrue(j == 10);
		assert1.assertFalse(false);
		System.out.println("This is test case 2");
	}
	
	@AfterClass
	public void tearDown() {
		assert1.assertAll();
	}
	
}
