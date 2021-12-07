package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class BasePage extends TestBase {
	
	public WebElement element = null;
	
	public BasePage() {
		PageFactory.initElements(driver, this);
	}
}
