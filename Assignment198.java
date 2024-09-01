package TestNGCLAssignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

//WAP to logout from amazon & find out if the testcase is pass or fail;

public class Assignment198 {

	WebDriver driver;

	@Test
	public void amazlogout() throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumBasics\\DDT\\Abhilash.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);

		String un = w1.getSheet("Sheet4").getRow(0).getCell(0).getStringCellValue();
		String pswd = w1.getSheet("Sheet4").getRow(0).getCell(1).getStringCellValue();

		driver = new FirefoxDriver();

		driver.get("https://amazon.in");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.className("a-button-input")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys(pswd);
		driver.findElement(By.id("signInSubmit")).click();

		WebElement o1 = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

		Actions a1 = new Actions(driver);

		a1.moveToElement(o1).perform();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[.='Sign Out']")).click();

		WebElement s2 = driver.findElement(By.name("email"));
		
		Assert.assertEquals(s2.isDisplayed(), true,"sorry");

	}

}
