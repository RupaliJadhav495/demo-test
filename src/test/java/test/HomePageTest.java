package test;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Login;
import utility.ScreenShot;


public class HomePageTest extends BaseTest{
	public HomePage Home;
	public ScreenShot Shoot;
	public void initObject() {
		Home=new HomePage(driver);
		Shoot=new ScreenShot();
	}
	@BeforeClass
	  public void driverinitialization() {
		  initObject();
	  }
	@Test(priority = 1,testName="Click Make An Impact Button",enabled =true)
	public void ValidateMakeAnImapct() throws IOException, InterruptedException {
		Home.MakeAnImpactFunction();
		Thread.sleep(1000);
		Shoot.ScreenImg();
		Thread.sleep(1000);
	}
	@Test(priority = 2,testName="Click SignUp Button",enabled =true)
	public void ValidateSignUpButton() throws InterruptedException, IOException {
		Home.SignUpFunction();
		Thread.sleep(1000);
		Shoot.ScreenImg();
	}
	@Test(priority = 4,testName="Click Show More Button",enabled =true)
	public void ValidateShowMoreButton() throws InterruptedException, IOException {
		Home.ShowMoreFunction();
		Thread.sleep(1000);
		Shoot.ScreenImg();
	}
	@Test(priority = 5,testName="Reading Bowser and Impact Inv Table",enabled =true)
	public void ValidateBrowserImpactTableVisibility() {
		Home.BrowserImpactInvTabel();
		
	}
	@Test(priority = 6,testName="Links on Home Page",enabled =true)
	public void ValidateLinkOnPage() {
		Home.LinksOnHomePage();
		
	}
	@Test(priority = 7,testName="Navigation function",enabled =true)
	public void ValidateNavigation() throws InterruptedException {
		Home.NavigationFunction();
		Thread.sleep(1000);
		
	}
	@Test(priority = 8,testName="Navigation function",enabled =true)
	public void ValidatePageScroll() throws InterruptedException {
		Home.ScrollPage();
		Thread.sleep(1000);
		
	}
	
	
	
	
	
	
}
