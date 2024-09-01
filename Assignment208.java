package TestNGCLAssignments;

import org.testng.Assert;
import org.testng.annotations.Test;

//WAP to Skip a TestCase using dependsOnMethod?
public class Assignment208 {

	@Test
	public void skiptestcase() {

		Assert.assertTrue(false);

	}

	@Test
	public void testcase01() {

		System.out.println("testcase 01");

	}

	@Test(dependsOnMethods = "skiptestcase") // this will not excute because depends on skiptestcase
	public void testcase02() {

		System.out.println("Testcase 02");

	}

}
