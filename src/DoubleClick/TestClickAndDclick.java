package DoubleClick;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestClickAndDclick {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
	}
	public void clickanddclick() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		
		Actions obja = new  Actions(driver);
		obja.contextClick().perform();//used to do right click on screen on top left corner
		Thread.sleep(2000);
		obja.contextClick(email).perform();//used to do right click on screen on email webelement
		Thread.sleep(2000);
		obja.click(email).perform();//used to do click on web element
		Thread.sleep(2000);
		obja.click().perform();//Same as normal click
		Thread.sleep(2000);
		obja.doubleClick().perform();//Used to double click on screen
		Thread.sleep(2000);
		obja.doubleClick(email).perform();//used to do double click on web element
		Thread.sleep(2000);

		obja.sendKeys(Keys.PAGE_DOWN).perform();//used to do keyboard operation by putting keys .inside brackets
		Thread.sleep(2000);
		email.sendKeys("Hello@gmail.com");
		Thread.sleep(2000);
		obja.sendKeys(email,Keys.BACK_SPACE).perform();////used to do keyboard operation by putting keys .inside brackets for specification

	}
	public static void main(String[] args) throws InterruptedException {
		TestClickAndDclick obj = new TestClickAndDclick();
		obj.DriverSetting();
		obj.clickanddclick();
	}
}
