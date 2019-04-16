package listeners_Pkg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners_With_Testng implements ITestListener {

	public void onTestStart(ITestResult context) {
		System.out.println("*****Test started : "+context.getName());
		
	}
	
	public void onFinish(ITestContext result) {
		System.out.println("*****Test completed : "+result.getName());
		
	}

	public void onStart(ITestContext context) {
		//System.out.println("*****Test started : "+context.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*****Test failed but with sucess percentage : "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*****Test Failed : "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****Test skipped : "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****Test sucess : "+result.getName());
		
	}
	

}
