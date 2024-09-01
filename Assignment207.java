package TestNGCLAssignments;

import org.testng.annotations.Test;

//WAP using TestNG grouping concept using include & exclude in xml file?

public class Assignment207 {

	@Test(groups = { "smoke" })
	public void testcase01() {
		System.out.println("testcase01");
	}

	@Test(groups = { "smoke" })
	public void testcase02() {
		System.out.println("testcase02");
	}

	@Test(groups = { "smoke" })
	public void testcase03() {
		System.out.println("testcase03");

	}

	@Test(groups = { "component" })
	public void testcase04() {
		System.out.println("testcase04");
	}

}
