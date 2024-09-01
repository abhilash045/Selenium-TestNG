package TestNGCLAssignments;

import org.testng.annotations.Test;

//WAP using @Test(priority) in a single class ?

public class Assignment180 {

	@Test(priority = 3)

	static void class05() {

		System.out.println("class05");

	}

	@Test(priority = 1)
	static void class02() {

		System.out.println("class02");

	}

	@Test(priority = 2)
	static void class04() {

		System.out.println("class04");

	}

	@Test(priority = 4)
	static void class06() {

		System.out.println("class06");

	}

}
