package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTypesDemo {
	
	@Test
    public void SoftAssertTest() {
		SoftAssert soft_assert = new SoftAssert();
		System.out.println("I am executed b4 soft assert");
		soft_assert.assertTrue(false);
		System.out.println("Executed soft assert");
	 }
	
	@Test
	public void HardAssertTest() {
		System.out.println("I am executed b4 hard assert");
		Assert.assertTrue(false);
		System.out.println("Executed hard assert");
	}
}
