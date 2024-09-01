package TestNGCLAssignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//WAP using BM, Test1, Test2, AM Annotations?

public class Assignment185 {

	@BeforeMethod
	static void BeforeMethod() {

		System.out.println("BeforeMethod");

	}

	@Test
	static void Testcase01() {

		System.out.println("Testcase01");
	}

	@Test
	static void Testcase02() {

		System.out.println("Testcase02");

	}

	@AfterMethod
	static void AfterMethod() {

		System.out.println("AfterMethod");

	}

}
