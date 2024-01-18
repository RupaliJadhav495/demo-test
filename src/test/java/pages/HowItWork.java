package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class HowItWork {
	public WebDriver driver;
	public WebDriverWait wait;

    @FindBy(xpath = "//a[text()=\"How it works\"]")
	private WebElement HowItWorkButton;
    @FindBy(xpath = "//h2[text()=\"How it works\"]")
	private WebElement HowItWorkHeadLine;
    public HowItWork(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
    public void OpenHowItWorkPg() {
    	try {
    	wait.until(ExpectedConditions.visibilityOf(HowItWorkButton));
    	HowItWorkButton.click();
    	String title=driver.getCurrentUrl();
    	Reporter.log(title, true);
    	}catch (Exception e) {
			// TODO: handle exception
		}
    }
}
