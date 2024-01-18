package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HowItWork;

public class HowItWorkTest extends BaseTest{
	public HowItWork Hw;
	public void initObject() {
		Hw=new HowItWork(driver);
	}
	@BeforeClass
	  public void driverinitialization() {
		  initObject();
	  }
	@Test(priority = 1,testName="Lunch How It Work Page",enabled =true)
	  public void CheckHowItWork() throws InterruptedException {
		  Hw.OpenHowItWorkPg();
		  Reporter.log("How it Page is Opened", true);
	  }
}
