package PomPackage;
	import java.time.Duration;

	import org.openqa.selenium.ElementClickInterceptedException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Page3 {
		
	private WebDriver driver;
		@FindBy (xpath="//span[text()=' Contacts ']") private WebElement contact;
		@FindBy (xpath="(//span[text()=' Calendars '])[1]") private WebElement calender;
		@FindBy (xpath="//input[@type='checkbox']") private WebElement contactVisibility;
		@FindBy (xpath="//button[@id='pg-appt__btn--appt-add']") private WebElement bookAppointment;
		@FindBy (xpath="//iframe[@name='calendar-app']") private WebElement iframe;
		@FindBy (xpath="//div[text()='Add New']") private WebElement addContact ;
	//	@FindBy (xpath="//div[@class='flex items-center w-full py-2 cursor-pointer hover:bg-gray-300 bg-gray-100']") private WebElement selectContact;
		@FindBy (xpath="//input[@placeholder='(eg) John Doe']") private WebElement UserName;
		@FindBy (xpath="//input[@placeholder='(eg) +1 900 900 9000']") private WebElement phone;
		@FindBy (xpath="//input[@placeholder='(eg) john@john.com']") private WebElement email;
		@FindBy (xpath="//button[@id='save-contact-button']") private WebElement saveContact;

		@FindBy (xpath="//div[@class='bg-gray-100 px-4 py-3']//div[@class='mt-2 text-right text-xs underline']//span") private WebElement selectCustome ;
		@FindBy (xpath="//input[@placeholder='(eg) Appointment with Bob']") private WebElement title;
		@FindBy (xpath="//button[@id='save-appointment-button']") private WebElement saveAppointment  ;
		
		
		
		
		public Page3(WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		public void bookAppointmentaddcontact() {

//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
//			wait.until(ExpectedConditions.visibilityOfAllElements(calender,bookAppointment,addContact));
			calender.click();
			bookAppointment.click();
			driver.switchTo().frame(iframe);
			addContact.click();
			UserName.sendKeys("xyz");
			phone.sendKeys("9175525975");
			email.sendKeys("abc@xyz.com");
			saveContact.click();
	


		}
		
		public void bookAppointment() throws Exception{
//			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//			wait.until(ExpectedConditions.visibilityOfAllElements(selectCustome,title,saveAppointment));
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.switchTo().frame(iframe);
			selectCustome.click();
			title.sendKeys("new meet");
			saveAppointment.click();
			driver.switchTo().defaultContent();
		
	}

}
