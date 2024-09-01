package TestNGCLAssignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*WAP using iframe on Amazon payments page fill credit/debit details and reach till use this payment method*/

public class Assignment205 {

	@Test

	public void Azpayment() throws EncryptedDocumentException, IOException, InterruptedException

	{

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\USER\\eclipse-workspace\\SeleniumBasics\\DDT\\Abhilash.xlsx");

		Workbook w1 = WorkbookFactory.create(f1);

		String un = w1.getSheet("Sheet4").getRow(0).getCell(0).getStringCellValue();

		String pswd = w1.getSheet("Sheet4").getRow(0).getCell(1).getStringCellValue();

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.findElement(By.className("nav-line-1-container")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("ap_email_login")).sendKeys(un);
		driver.findElement(By.className("a-button-input")).click();

		driver.findElement(By.id("ap_password")).sendKeys(pswd);
		driver.findElement(By.id("signInSubmit")).click();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes" + Keys.ENTER);

		driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect'][1]")).click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> p1 = s1.iterator();
		String parent = p1.next();
		String child = p1.next();

		driver.switchTo().window(child);

		driver.findElement(By.id("buy-now-button")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[4]")).click();
		

		driver.findElement(By.linkText("Enter card details")).click();

		WebElement iframe =driver.findElement(By.name("ApxSecureIframe"));
			driver.switchTo().frame(iframe);
		
	
		WebElement Creditcard = driver.findElement(By.name("addCreditCardNumber"));
		Creditcard.sendKeys("203358941752");

		WebElement CName = driver.findElement(By.name("ppw-accountHolderName"));
		CName.sendKeys("Abhilashpasikanti");

		List<WebElement> dropdown = driver.findElements(By.className("a-dropdown-link"));
		int count = dropdown.size();

		for (int i = 0; i < count; i++) {
			WebElement month = dropdown.get(i);
			String mm = month.getText();
			if (mm.contains("01")) {
				month.click();
				month.sendKeys(Keys.ENTER, Keys.TAB);
				break;
			}
		}

		List<WebElement> qq1 = driver.findElements(By.className("a-dropdown-link"));
		int count1 = qq1.size();
		System.out.println(count1);
		for (int i = 0; i < count1; i++) {
			WebElement month = qq1.get(i);
			String mm = month.getText();
			if (mm.contains("2025")) {
				month.click();
				month.sendKeys(Keys.ENTER, Keys.TAB);
				break;
			}
		}

		driver.findElement(By.name("ppw-widgetEvent:AddCreditCardEvent")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='a-column a-span12 pmts-credit-card-verification']/input[1]"))
				.sendKeys("601");
		driver.findElement(By.xpath("//span[@data-action='a-tooltip-button-blocker']/span/span/span/input")).click();
	}

}
