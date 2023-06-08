package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5 {

	private WebDriver driver;
	
	@FindBy (xpath="//input[@id='all']") private WebElement checkBox;
	@FindBy (xpath="//button[@data-original-title='Delete']") private WebElement delete;
	@FindBy (xpath="//button[text()=' Confirm ']") private WebElement confirm;
	
	public Page5(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void delete() {
		
		checkBox.click();
		delete.click();
		confirm.click();
	}
}
