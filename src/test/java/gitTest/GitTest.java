package gitTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest {

	@Test
	public void LoginTest() throws IOException {
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.google.com");
		WebElement element = wd.findElement(By.name("q"));
		element.sendKeys("chennai");
		element.submit();
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Seleniumworkspace\\Webdriver\\File\\File1\\gooleeee.jpg"));
		

	}

}
