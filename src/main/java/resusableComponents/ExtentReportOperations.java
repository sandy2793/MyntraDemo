package resusableComponents;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportOperations {
	
	public static ExtentReports initExtentReport() {
		ExtentSparkReporter spark = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports/report.html"));
		spark.config().setDocumentTitle("MyntraDemo");
		spark.config().setTheme(Theme.DARK);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		return extent;
	}
	
}
