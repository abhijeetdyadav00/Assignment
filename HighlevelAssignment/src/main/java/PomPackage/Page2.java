package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page2 {

	private WebDriver driver;
	
	@FindBy (xpath="//span[text()=' Contacts ']") private WebElement contact;
	@FindBy (xpath="//button/descendant::i[@class='icon icon-plus']") private WebElement add;
	@FindBy (xpath="//input[@placeholder='First Name']") private WebElement firstName;
	@FindBy (xpath="//input[@placeholder='Last Name']") private WebElement LastName;
	@FindBy (xpath="//input[@placeholder='Email 1']") private WebElement email;
	@FindBy (xpath="//select[@name='timezone']") private WebElement timezone;
	@FindBy (xpath="//button[@type='submit']") private WebElement submit;
	
	public Page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickOnContact() {
		contact.click();
	}
	
	public void contactDetails() {
		add.click();
		firstName.sendKeys("Abhijeet");
		LastName.sendKeys("Yadav");
		email.sendKeys("xyz@abc.com");
		
		Select s=new Select(timezone);
		s.selectByVisibleText("GMT+05:30 Asia/Calcutta (IST)");
		
		submit.click();
		
	}
}
