package PomPackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet Yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.gohighlevel.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		WebElement user=driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("ghlqa3@gohighlevel.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Test123!");
		WebElement submit=driver.findElement(By.xpath("//button[@type='button']"));
		submit.click();
		
		WebElement calender=driver.findElement(By.xpath("(//span[text()=' Calendars '])[1]"));
		calender.click();
		
		Thread.sleep(3000);
		
		WebElement BA=driver.findElement(By.xpath("//button[@id='pg-appt__btn--appt-add']"));
		BA.click();
		Thread.sleep(3000);
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@name='calendar-app']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		
		WebElement addcontact=driver.findElement(By.xpath("//div[text()='Add New']"));
		addcontact.click();
		Thread.sleep(3000);
		
		WebElement Cuser=driver.findElement(By.xpath("//input[@placeholder='(eg) John Doe']"));
		Cuser.sendKeys("abhi");

		
		WebElement Cphone=driver.findElement(By.xpath("//input[@placeholder='(eg) +1 900 900 9000']"));
		Cphone.sendKeys("9175525973");
		
		WebElement cemail=driver.findElement(By.xpath("//input[@placeholder='(eg) john@john.com']"));
		Cuser.sendKeys("abc@hgb.com");
		
		WebElement saveuser=driver.findElement(By.xpath("//button[@id='save-contact-button']"));
		saveuser.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(iframe);
		Thread.sleep(3000);
		WebElement custom=driver.findElement(By.xpath("//div[@class='bg-gray-100 px-4 py-3']//div[@class='mt-2 text-right text-xs underline']//span"));
		custom.click();
		
		
		
	}

}
