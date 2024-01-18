package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AboutUs;
import pages.HomePage;
import utility.ScreenShot;

public class AboutUsTest extends BaseTest{
 public AboutUs Ab;
 public ScreenShot Shoot;
 public void initObject() {
		Ab=new AboutUs(driver);
		Shoot=new ScreenShot();
	}
 @BeforeClass
 public void driverinitialization() {
	  initObject();
 }
@Test(priority = 1,testName="Click AboutUs  Button",enabled =true)
public void ValidateAboutUsFuntion() throws IOException, InterruptedException {
	Ab.AboutUsFunction();
	Thread.sleep(1000);
	String AboutUsUrl=driver.getCurrentUrl();
	  Reporter.log("About Us Page URL: "+AboutUsUrl, true);
	  String ExpectedAboutUsUrl="http://demo-user:Demo%40321!@demo.maanch.com/#AboutUs";
	  Assert.assertEquals(AboutUsUrl,ExpectedAboutUsUrl);
}
}
