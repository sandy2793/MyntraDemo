package resusableComponents;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.TestBase;

public class WebdriverOperations extends TestBase {
	static boolean verify = false;
	
	public static void Hover_Actions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	public static void HoverAndClick_Actions(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}
	
	public static void visibilityOfAllElementsExplicitWait(WebElement element, int waitInSeconds) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitInSeconds));
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isElementPresent(WebElement element) {
		try {
			verify = element.isDisplayed();
		} catch (Exception e) {
			verify = false;
			System.out.println(element+" is not present!!!");
			e.printStackTrace();
		}
		return verify;
	}
	
	public static String[] getWindowIDs() {
		Set<String> widnowshandlesList = driver.getWindowHandles();
		String[] windowIDs = new String[widnowshandlesList.size()];
		int i = 0;
		for (Iterator<String> iterator = widnowshandlesList.iterator(); iterator.hasNext();) {
			windowIDs[i] = (String) iterator.next();
			i++;
		}
		return windowIDs;
	}
	
	public static void switchToWindow(int windowIndexNo) {
		String[] windowIDs = getWindowIDs();
		driver.switchTo().window(windowIDs[windowIndexNo]);
	}
	
	
}
