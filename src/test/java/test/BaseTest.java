package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;

	@BeforeTest
	public void createSession() {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
//	 driver=new ChromeDriver();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();

			driver.get("http:demo-user:Demo@321!@demo.maanch.com/");

			Reporter.log("Url lunch and Home Page is Opened", true);
		} catch (Exception e) {

		}
	}

	@AfterTest
	public void closeSession() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
