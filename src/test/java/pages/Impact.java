package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Impact {
	public WebDriver driver;
	public WebDriverWait wait;

	@FindBy(xpath = "//a[text()=\"Impact\"]")
	private WebElement ImpactButton;

	public Impact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void OpenImpactPage() {
		try {
			wait.until(ExpectedConditions.visibilityOf(ImpactButton));
			ImpactButton.click();
			Thread.sleep(1000);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
