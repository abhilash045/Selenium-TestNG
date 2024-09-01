package TestNGCLAssignments;

import org.testng.annotations.Test;

//Create multiple classes, then create xml file of the package & run the program?

public class Assignment179 {

	@Test(priority = 1)
	static void School() {

		System.out.println("School");

	}

	@Test(priority = 2)
	static void College() {

		System.out.println("College");
	}

	@Test(priority = 3)
	static void University() {

		System.out.println("University");
	}

	@Test(priority = 0)
	static void pre_school() {

		System.out.println("pre_school");
	}

}
