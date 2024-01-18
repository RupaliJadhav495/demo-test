package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
import test.BaseTest;

public class ScreenShot extends BaseTest {
	public void ScreenImg() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
																
		String RanStr = RandomString.make(3);

		File dest = new File("D:\\Selenium\\ScreenShots\\DemoScreenShots\\test" + RanStr + ".jpg");

		FileHandler.copy(src, dest);
	}
}
