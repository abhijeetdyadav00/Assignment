package TestPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomPackage.Page1;
import PomPackage.Page2;
import PomPackage.Page3;
import PomPackage.Page4;
import PomPackage.Page5;
import PomPackage.Page6;

public class TestClass1 {

	WebDriver driver;
	Page1 page1;
	Page2 page2;
	Page3 page3;
	Page4 page4;
	Page5 page5;
	Page6 page6;
	
	@BeforeTest
	public void beforetest() {
	
	 	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet Yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.gohighlevel.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		page1=new Page1(driver);
		page2=new Page2(driver);
		page3=new Page3(driver);
		page4=new Page4(driver);
		page5=new Page5(driver);
		page6=new Page6(driver);
		
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		page1.userdetails();
	}
	
	@Test (priority=1)
	public void addContact() {
	page2.clickOnContact();	
	page2.contactDetails();
	}
	

	@Test (priority=2)
	public void addAppointment() throws Exception{

		page3.bookAppointmentaddcontact();
		Thread.sleep(3000);
		page3.bookAppointment();
	
	}
	
	@Test(priority=3)
	public void deleteAppointmnet() throws InterruptedException{
		Thread.sleep(3000);
		page6.deleteAP();
	}
	
	@Test (priority=4)
	public void deleteContact() {
		page2.clickOnContact();	
		page5.delete();
	}
	
	
	
	
	@AfterMethod
	public void logout() {
		page4.signOut();
		
	}
	
	
	
}
