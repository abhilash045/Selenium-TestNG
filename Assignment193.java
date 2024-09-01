package TestNGCLAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//WAP to login to facebook using DataProvider?

public class Assignment193 {

	WebDriver driver;
	
		@DataProvider(name= "data1")
		public Object datavalue() {
			Object s1[][]= new Object[2][2];
			
			s1[0][0]="abhilash.var5@gmail.com";
			s1[0][1]= "selenium";
			
			s1[1][0]="abhilash.var5@gmail.com";
			s1[1][1]= "seleniumclass";
			return s1;
		}
		
		@Test(dataProvider = "data1")
		public void fblogin(String un, String pass) {
			
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pass);
			
			driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
