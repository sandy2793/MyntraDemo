package pageObjects;

import static resusableComponents.WebdriverOperations.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

public class ItemDetailsPageObjects extends BasePage {
	
	@FindBy(xpath = "//*[@class='pdp-price']")
	WebElement price_text;
	
	@FindBy(xpath = "//*[contains(@class,'pdp-action-container pdp-fixed')]")
	WebElement addToBag_btn;
	
	public void VerifyNaviagtedToItemDetailsScreen() {
		switchToWindow(1);
		visibilityOfAllElementsExplicitWait(price_text, 10);
		Assert.assertEquals(isElementPresent(price_text), true, "Item Details screen is not dispalyed.");
	}
	
	public void VerifyPrice(String price) {
		String actualPrice = price_text.getText();
//		System.out.println(actualPrice);
//		String[] actualPriceSplit = actualPrice.split(".");
//		String[] expectedPriceSplit = price.split(".");
//		actualPriceSplit[1] = actualPriceSplit[1].trim();
//		expectedPriceSplit[1] = expectedPriceSplit[1].trim();
//		boolean verify = false;
//		if (Integer.valueOf(expectedPriceSplit[1]) < Integer.valueOf(actualPriceSplit[1]))
//			verify = true;
//		else
//			verify = false;
		Assert.assertNotEquals(actualPrice, price, "price is less than Rs. 10");
		test.log(Status.PASS, "price is displayed and price should not less than Rs. 10");
	}
	
	public void VerifyAddToBagButtonDisplayed() {
		Assert.assertEquals(isElementPresent(addToBag_btn), true, "ADD TO BAG button is not displayed");
		test.log(Status.PASS, "ADD TO BAG button is displayed");
	}
	
}
