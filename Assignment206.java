package TestNGCLAssignments;

import org.testng.annotations.Test;

//WAP using TestNG grouping concept using include in xml file?

public class Assignment206 {

	@Test(groups = { "smoke" })

	public void testcase01() {

		System.out.println("Testcase01");

	}

	@Test(groups = { "component" })
	public void testcase02() {

		System.out.println("testcase02");
	}

	@Test(groups = { "smoke" })
	public void testcase03() {

		System.out.println("testcasse03");
	}

	@Test(groups = "smoke")
	public void testcase04() {

		System.out.println("testcase04");

	}

	@Test(groups = { "component" })
	public void testcase05() {

		System.out.println("testcase05");

	}

	@Test(groups = { "smoke" })
	public void testcase06() {

		System.out.println("testcase06");
	}

}
