package pageObjects;

import java.util.List;
import static resusableComponents.WebdriverOperations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class MobilePhoneCasesPageObjects extends BasePage {
	
	@FindBy(xpath = "//*[@class='title-title']")
	WebElement mobilePhoneCases_screen;
	
	@FindBy(xpath = "//*[@id='desktopSearchResults']/div[2]/section/ul/li")
	List<WebElement> phoneCaseSearchResult_list;
	
	
	public void VerifyNavigatedToMobilePhoneCasesScreen() {
		visibilityOfAllElementsExplicitWait(mobilePhoneCases_screen, 10);
		Assert.assertEquals(isElementPresent(mobilePhoneCases_screen), true, "Mobile Phone Cases screen is not displayed.");
	}
	
	public void ClickOnItem(int itemIndexNo) throws Throwable {
		phoneCaseSearchResult_list.get(itemIndexNo-1).click();
		Thread.sleep(500);
	}
	
	
}
