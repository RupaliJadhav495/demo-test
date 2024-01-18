package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker.TimeoutException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class AboutUs {
	public WebDriver driver;
	public WebDriverWait wait;
	@FindBy(xpath = "//a[text()=\"About Us\"]")
	private WebElement AboutUsButton;
	public AboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void AboutUsFunction() {
		try {
			wait.until(ExpectedConditions.visibilityOf(AboutUsButton));
			AboutUsButton.click();
			Reporter.log("AboutUs Page is Open", true);
			
		}catch (Exception e) {
			Reporter.log("About Us funtion is not working", true);
		}
	}

}
