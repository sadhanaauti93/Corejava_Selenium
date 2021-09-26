package IframeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestIframes {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	public void testiframeRediff() {
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		driver.findElement(By.name("query")).sendKeys("Testing iframe");   //use name or id
		driver.switchTo().defaultContent();
	}
	public static void main(String[] args) {
		TestIframes objTI = new TestIframes();
		objTI.DriverSetting();
		objTI.testiframeRediff();
	}
}
