package TestNGCLAssignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP to launch amazon, search shoes,
//click on 1st product then switch control to child tab & go to payments page?

public class Assignment190 {

	WebDriver driver;

	@Test
	public void amazon() throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumBasics\\DDT\\Abhilash.xlsx");

		Workbook s1 = WorkbookFactory.create(f1);

		String uname = s1.getSheet("Sheet4").getRow(0).getCell(0).getStringCellValue();

		String pswd = s1.getSheet("Sheet4").getRow(0).getCell(1).getStringCellValue();

		// loginpage---

		driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-orders%2Forders%3Fref_%3Dnav_orders_first&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_retail_yourorders_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();

		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.id("ap_password")).sendKeys(pswd);

		driver.findElement(By.id("signInSubmit")).click();

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes" + Keys.ENTER);

		Set<String> parentwindow = driver.getWindowHandles();
		Iterator<String> id = parentwindow.iterator();

		String parentid = id.next(); // parent id
		String childid = id.next(); // child id

		driver.switchTo().window(childid);
		driver.findElement(By.id("buy-now-button")).click();

	}

}
