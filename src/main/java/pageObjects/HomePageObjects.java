package pageObjects;

import static resusableComponents.WebdriverOperations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageObjects extends BasePage {
	
	@FindBy(xpath="//*[text()='Men' and @data-group='men']")
	WebElement men_link;
	
	@FindBy(linkText = "Phone Cases")
	WebElement phoneCases_link;
	
	
	public void HoverOnMainMenu(String label) throws Exception {
		switch (label) {
		case "Men":
			element = men_link;
			break;

		default:
			throw new Exception("'"+label+"' label is invalid!!!");
		}
		Hover_Actions(element);
		Thread.sleep(300);
	}
	
	
	public void ClickOnMenu(String label) throws Throwable {
		switch (label) {
		case "Phone Cases":
			element = phoneCases_link;
			break;

		default:
			throw new Exception("'"+label+"' label is invalid!!!");
		}
		HoverAndClick_Actions(element);
		Thread.sleep(500);
	}
	
	
}
