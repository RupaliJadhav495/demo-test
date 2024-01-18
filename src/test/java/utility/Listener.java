package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	public ScreenShot Shot;
@Override
public void onTestFailure(ITestResult result) {
	try {
	String tcName = result.getName();
	Reporter.log("TC "+tcName+ " is failed, please try again", true);
	Shot.ScreenImg();
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
@Override
	public void onTestSuccess(ITestResult result) {
	try {
		String tcName = result.getName();
		Reporter.log("TC "+tcName+ " is Successfull.", true);
		Shot.ScreenImg();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
