package PomPackage;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4 {
	
private WebDriver driver;
	
	@FindBy (xpath="//div[text()=' GQ ']") private WebElement profileClick;
	@FindBy (xpath="//a[text()='Signout']") private WebElement clickSignOut;

	
	public Page4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void signOut() {
		try{
			profileClick.click();
		    clickSignOut.click();}
		catch(ElementClickInterceptedException e){
			profileClick.click();
		    clickSignOut.click();}	
		}
		
	}


