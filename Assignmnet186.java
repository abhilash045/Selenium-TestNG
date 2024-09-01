package TestNGCLAssignments;

import org.testng.annotations.Test;

//WAP using all the annotations but having 2 @Test?

public class Assignmnet186 {

	@Test(priority = 1)
	static void testcase02() {
		System.out.println("testcase02");
	}

	@Test
	static void testcase01() {
		System.out.println("testcase01");
	}
}
