package TestNGCLAssignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//WAP to login to amazon & using search component program find out if the testcase is pass or fail?	

public class Assignment196 {

	WebDriver driver;

	@Test

	public void amz01() throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumBasics\\DDT\\Abhilash.xlsx");

		Workbook f2 = WorkbookFactory.create(f1);

		String un = f2.getSheet("sheet4").getRow(0).getCell(0).getStringCellValue();
		String pswd = f2.getSheet("sheet4").getRow(0).getCell(1).getStringCellValue();

		String Excep = "Amazon";
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");

		driver.findElement(By.xpath("//span[@Class='nav-line-2 ']")).click();

		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.className("a-button-input")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys(pswd);
		driver.findElement(By.id("signInSubmit")).click();
		
		Assert.assertEquals(driver.getTitle(),Excep,"sorry the title is not mateched");

	}

}
