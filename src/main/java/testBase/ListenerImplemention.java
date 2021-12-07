package testBase;

import resusableComponents.ExtentReportOperations;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerImplemention extends ObjectFactory implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Mayntra Demo Test Case Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Mayntra Demo Test Case Pass");
		test.log(Status.FAIL, result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		extent = ExtentReportOperations.initExtentReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
}
