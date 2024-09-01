package TestNGCLAssignments;

import org.testng.annotations.Test;

//WAP using @Test(invocationCount) in a single class?

public class Assignment181 {

	@Test(invocationCount = 5) // to repate same testcase for multpule times

	static void newclass() {
		System.out.println("invocationCount");
	}

}
