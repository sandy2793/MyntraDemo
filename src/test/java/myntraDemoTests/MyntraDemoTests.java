package myntraDemoTests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.TestBase;

public class MyntraDemoTests extends TestBase {
	
	@Test
	public void MyntraDemoTest1() throws Throwable {
		homePage.HoverOnMainMenu("Men");
		test.log(Status.INFO, "Select 'MEN' tab");
		homePage.ClickOnMenu("Phone Cases");
		test.log(Status.INFO, "Inside Fashion Accessories click on 'Phone Cases'");
		phoneCasesPage.VerifyNavigatedToMobilePhoneCasesScreen();
		phoneCasesPage.ClickOnItem(11);
		test.log(Status.INFO, "click on 3rd row 3 item");
		itemDetailsPage.VerifyNaviagtedToItemDetailsScreen();
		itemDetailsPage.VerifyPrice("Rs. 10");
		itemDetailsPage.VerifyAddToBagButtonDisplayed();
	}

}
