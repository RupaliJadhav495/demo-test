package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.Login;

public class LoginTestDemo extends BaseTest {
	public Login Log;
	public void initObject() {
		Log=new Login(driver);
	}
	@BeforeClass
	  public void driverinitialization() {
		  initObject();
	  }
	@Test(priority = 1,testName="Lunch Login/SignUp Page",enabled =true)
	  public void LoginSignUpTest() throws InterruptedException {
		  Log.openLoginPage();
		  
	  }
	

}
