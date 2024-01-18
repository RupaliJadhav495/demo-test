package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Login {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
     @FindBy(xpath = "//a[text()=\"Login/Sign up\"]")
	private WebElement LoginButton;
     @FindBy(xpath = "//p[contains(text(),\"Login to check \")]")
     private WebElement LoginSentence;
     
	
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void openLoginPage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(LoginButton));
			LoginButton.click();
			wait.until(ExpectedConditions.visibilityOf(LoginSentence));
			String ActualSentence=LoginSentence.getText();
			String ExpectedSentence="Login to check the latest activities on your profile.";
			Reporter.log(ActualSentence, true);
			Assert.assertEquals(ActualSentence,ExpectedSentence,"Result is Matching");
			
		}catch(Exception e) {
			
		}
	}
	
	

}
