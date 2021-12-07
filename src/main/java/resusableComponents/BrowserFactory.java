package resusableComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	public static WebDriver launchBrowser(String browserName) throws Throwable {
		WebDriver driver;
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		default:
			throw new Exception("'"+browserName+"' browser name is invalid!!!");
		}
		driver.manage().window().maximize();
		
		return driver;
	}
	
}
