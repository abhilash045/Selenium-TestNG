package TestNGCLAssignments210_02;

import org.testng.annotations.Test;

import TestNGCLAssignments210_01.Assignment210FB_Source_01;

public class Assignment210_TestCase extends Assignment210BMAM {

	@Test
	public void Testcase() {

		Assignment210FB_Source_01 a1 = new Assignment210FB_Source_01(driver);

		a1.email_id();
		a1.pswd();
		a1.login_button();

	}

}
