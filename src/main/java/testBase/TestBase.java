package testBase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pageObjects.HomePageObjects;
import pageObjects.ItemDetailsPageObjects;
import pageObjects.MobilePhoneCasesPageObjects;

import static resusableComponents.BrowserFactory.*;
import static resusableComponents.PropertiesFileReader.*;

import java.time.Duration;

public class TestBase extends ObjectFactory {
	
	@BeforeMethod
	public void initTest() throws Throwable {
		driver = launchBrowser(getKeyValue("browser.name"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(getKeyValue("implicit.wait"))));
		driver.get(getKeyValue("url"));
		
		homePage = new HomePageObjects();
		phoneCasesPage = new MobilePhoneCasesPageObjects();
		itemDetailsPage = new ItemDetailsPageObjects();
	}
	
	
	
	@AfterMethod
	public void closeBrowser() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
	}

}
