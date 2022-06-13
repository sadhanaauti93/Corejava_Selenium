package Screenshorts;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class GmailScreenshot {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	  public void Gscreenshot() {
		  driver.get("https://mail.google.com/mail/u/0/#inbox");
		  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File target = new File("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Screenshot\\login.png");
	  try {
		FileHandler.copy(source, target);
	} catch (IOException e) {
		e.printStackTrace();
	}
	  }
	public static void main(String[] args) {
		GmailScreenshot objg = new GmailScreenshot();
		objg.DriverSetting();
		objg.Gscreenshot();
	}
}
/*
driver.get("URL");
File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)

*/