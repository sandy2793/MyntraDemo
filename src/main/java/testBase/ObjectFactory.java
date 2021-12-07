package testBase;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import pageObjects.HomePageObjects;
import pageObjects.ItemDetailsPageObjects;
import pageObjects.MobilePhoneCasesPageObjects;

public class ObjectFactory {
	public static WebDriver driver;
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static HomePageObjects homePage;
	public static MobilePhoneCasesPageObjects phoneCasesPage;
	public static ItemDetailsPageObjects itemDetailsPage;
	
}
