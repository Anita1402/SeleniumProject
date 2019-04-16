package listeners_Pkg;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//adding listener methods by using implements
public class listeners_With_Testng implements ITestListener, ISuiteListener {

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
		//can capture error image and other details here
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****Test skipped : "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****Test sucess : "+result.getName());
		
	}

	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
