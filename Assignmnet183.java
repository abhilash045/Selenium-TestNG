package TestNGCLAssignments;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//WAP using all the annotation in a single class?

public class Assignmnet183 {

	@BeforeSuite

	static void BeforeSuit() {

		System.out.println("BeforeSuit");

	}

	@BeforeTest
	static void BeforeTest() {

		System.out.println("BeforeTest");

	}

	@BeforeClass
	static void Beforeclass() {

		System.out.println("Beforeclass");

	}

	@BeforeMethod
	static void BeforeMethod() {

		System.out.println("BeforeMethod");

	}

	@Test
	static void Test() {

		System.out.println("Test");

	}

	@AfterSuite

	static void aftersuit() {

		System.out.println("aftersuit");

	}

	@BeforeSuite
	static void aftertest() {

		System.out.println("aftertest");

	}

	@AfterClass
	static void afterclass() {

		System.out.println("afterclass");

	}

	@AfterMethod
	static void aftermethod() {

		System.out.println("aftermethod");

	}

}
