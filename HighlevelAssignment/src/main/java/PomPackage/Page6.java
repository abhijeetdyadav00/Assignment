package PomPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page6 {

	private WebDriver driver;
	@FindBy (xpath="(//span[text()=' Calendars '])[1]") private WebElement calender;
	@FindBy (xpath="//span[text()=' Appointments ']") private WebElement appointment;
	@FindBy (xpath="//button[@title='Confirmed']") private WebElement dropdownclick ;
	@FindBy (xpath="//span[text()='Delete']") private WebElement delete;

	
	public Page6(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void deleteAP() throws InterruptedException {
		calender.click();
		Thread.sleep(3000);
		appointment.click();
		Thread.sleep(3000);
		dropdownclick.click();
		delete.click();
		driver.switchTo().alert().accept();
	}
}
