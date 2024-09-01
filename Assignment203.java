package TestNGCLAssignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WAP using implicit Wait on Amazon payments page ?

public class Assignment203 {

	@Test

	public void amz_payment() throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumBasics\\DDT\\Abhilash.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);

		String un = w1.getSheet("Sheet4").getRow(0).getCell(0).getStringCellValue();
		String pswd = w1.getSheet("Sheet4").getRow(0).getCell(1).getStringCellValue();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/ref=nav_logo");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("email")).sendKeys(un);
		driver.findElement(By.className("a-button-input")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys(pswd);
		driver.findElement(By.className("a-button-input")).click();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles", Keys.ENTER);
		WebElement r1 = driver.findElement(By.xpath("((//span[@class='rush-component'])/a/div)[1]"));
		r1.click();

		Set<String> w2 = driver.getWindowHandles();
		Iterator<String> I1 = w2.iterator();

		String parent = I1.next();

		String Childid = I1.next();
		
		driver.switchTo().window(Childid);
		
		driver.findElement(By.id("buy-now-button")).click();
		
		driver.quit();
		

	}

}
