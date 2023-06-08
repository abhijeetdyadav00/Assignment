package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

	private WebDriver driver;
	
	@FindBy (xpath="//input[@id='email']") private WebElement username;
	@FindBy (xpath="//input[@id='password']") private WebElement pass;
	@FindBy (xpath="//button[@type='button']") private WebElement submit;
	@FindBy (xpath="(//span[text()=' Calendars '])[1]") private WebElement Calender;
	
	public Page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void userdetails() {
		username.sendKeys("ghlqa3@gohighlevel.com");
		pass.sendKeys("Test123!");
		submit.click();
	}
	
	
}
