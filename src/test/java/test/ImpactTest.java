package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Impact;

public class ImpactTest extends BaseTest{
public Impact Im;
public void initObject() {
	Im=new Impact(driver);
}
@BeforeClass
public void driverinitialization() {
	  initObject();
}
@Test(priority = 1,testName="Lunch Impact Page",enabled =true)
public void CheckImpactPg() throws InterruptedException {
	  Im.OpenImpactPage();
	  Reporter.log("Impact Page is openend", true);
	  String ImpactUrl=driver.getCurrentUrl();
	  Reporter.log("Impact Page URL: "+ImpactUrl, true);
	  String ExpectedImpactUrl="http://demo-user:Demo%40321!@demo.maanch.com/#impact";
	  Assert.assertEquals(ExpectedImpactUrl,ImpactUrl);
}
}
