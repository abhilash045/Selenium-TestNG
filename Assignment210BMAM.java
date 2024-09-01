package TestNGCLAssignments210_02;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Assignment210BMAM {

	ChromeDriver driver;

	@BeforeMethod
	public void launchFacebook() {

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void Fb_Quit() throws InterruptedException {
		
		
		Thread.sleep(5000);

	//	driver.quit();

	}

}
