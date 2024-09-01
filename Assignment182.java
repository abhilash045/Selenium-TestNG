package TestNGCLAssignments;

import org.testng.annotations.Test;

//WAP using @Test(enabled) in a single class?

public class Assignment182 {

	@Test

	static void testEnabled() {

		System.out.println("testEnabled");

	}

	@Test(enabled = false) // enabled is used to exclude the required test which no need to run

	static void testEnabled01() {

		System.out.println("testEnabled01");

	}

}
