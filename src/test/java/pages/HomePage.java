package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import utility.ScreenShot;

public class HomePage {
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions Act;
	public HowItWork Hw;
	public ScreenShot Shot;
	
	@FindBy(xpath = "//a[text()=\"How it works\"]")
	private WebElement HowItWorkButton;
	@FindBy(xpath = "//a[text()=\"About Us\"]")
	private WebElement AboutUsButton;
	@FindBy(xpath = "//a[text()=\"Impact\"]")
	private WebElement ImpactButton;
	@FindBy(xpath = "//a[text()=\"Login/Sign up\"]")
	private WebElement LoginButton;
	@FindBy(xpath = "//a[@class=\"btn btn-grad btn-lg\"]")
	private WebElement MakeAnImpactButton;
	@FindBy(xpath = "//a[@class=\"btn btn-grad my-2\"]")
	private WebElement SignUpButton;
	@FindBy(xpath = "//a[@class=\"btn btn-grad\"]")
	private WebElement ShowMoreButton;
	@FindBy(xpath = "//h2[@class=\"main-heading my-3\"]")
	private WebElement BrowserImpactHeadingText;
	@FindBy(xpath = "//table[@id=\"charity-row\"]/thead/tr/th")
	private List<WebElement> BrowserImpactTablehead;
	@FindBy(tagName = "a")
	private List<WebElement> Links;
	@FindBy(xpath ="//h2[text()=\"How it works\"]")
	private WebElement Heading2;
	@FindBy(xpath ="//h2[text()=\"Why us?\"]")
	private WebElement Heading3;
	@FindBy(xpath ="//h2[text()=\"Testimonials\"]")
	private WebElement Heading4;
	@FindBy(xpath ="//h5[text()=\"Follow Us\"]")
	private WebElement Heading5;
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void MakeAnImpactFunction() throws InterruptedException {
		try{
			Act.moveToElement(MakeAnImpactButton).perform();
			Thread.sleep(1000);
			MakeAnImpactButton.click();
		}catch (NullPointerException Ne) {
			Ne.printStackTrace();
		}
		
	}
	public void SignUpFunction() {
		try{
			Act.moveToElement(SignUpButton).perform();
			wait.until(ExpectedConditions.visibilityOf(SignUpButton));
			SignUpButton.click();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void ShowMoreFunction() {
		try{
			Act.moveToElement(ShowMoreButton).perform();
			wait.until(ExpectedConditions.visibilityOf(ShowMoreButton));
			ShowMoreButton.click();
		}catch (Exception e) {
			// TODO: handle exception
		}	
	}
	public void BrowserImpactInvTabel() {
		try {
			Act.moveToElement(BrowserImpactHeadingText).perform();
			int HeadingCount=BrowserImpactTablehead.size();
			Reporter.log("Heading Count:" +HeadingCount, true);
			for(WebElement a:BrowserImpactTablehead) {
				Reporter.log(a.getText(),true);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void LinksOnHomePage() {
		try {
			int linkCount=Links.size();
			Reporter.log("Link count is: "+linkCount, true);
			for(WebElement a:Links) {
				Reporter.log(a.getText(),true);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void NavigationFunction() {
		try {
			Hw.OpenHowItWorkPg();
			Thread.sleep(1000);
			driver.navigate().back();
			Reporter.log("Back to home Page", true);
			driver.navigate().refresh();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void ScrollPage() {
		try {
			Act.moveToElement(Heading2).perform();
			Shot.ScreenImg();
			Reporter.log("How it work Heading", true);
			Thread.sleep(1000);
			Act.moveToElement(Heading3).perform();
			wait.until(ExpectedConditions.visibilityOf(Heading3));
			Shot.ScreenImg();
			Reporter.log("Why Us?", true);
			Act.moveToElement(Heading4).perform();
			wait.until(ExpectedConditions.visibilityOf(Heading4));
			Shot.ScreenImg();
			Reporter.log("Testimonials", true);
			Act.moveToElement(Heading5).perform();
			wait.until(ExpectedConditions.visibilityOf(Heading5));
			Shot.ScreenImg();
			Reporter.log("Follow Us", true);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
