package AutoIt;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAutoIT {
	WebDriver driver;      // WEbDriver is class
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);   //Waiting for 10 min per page 
		driver.manage().window().maximize();   // Chrome window will be max 
	}
	public void testautoit() {
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.id("pickfiles")).click();    //run only here 
		try {
			Runtime.getRuntime().exec("");    //Path test.exe file  //Runtime is class &  getRuntime is method  & exec is sun method
		} catch (IOException e) {
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, 4000);   //Waiting for 4 sec 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTaskTextBtn"))).click();   //Click on button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles"))).click();    //Click on download button
	}
	public static void main(String[] args) {
		TestAutoIT obj = new TestAutoIT();
		obj.DriverSetting();
		obj.testautoit();
	}
}
