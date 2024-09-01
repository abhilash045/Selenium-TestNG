package TestNGCLAssignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

//WAP using BS, BM, AM, AS, Test Annotation?

public class Assignment184 {
	
	@BeforeSuite 

	static void BeforeSuit()   //This program will not excute because of not written method @Test "annotation"
	{

	}

	@BeforeMethod
	static void BeforeMethod() {

	}

	@AfterMethod
	static void AfterMethod() {

	}

	@AfterSuite
	static void AfterSuit() {

	}

}
