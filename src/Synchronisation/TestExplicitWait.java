package Synchronisation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TestExplicitWait {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);   //All over webpage 
	}
	public void testexplicitwait() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebDriverWait wait = new WebDriverWait(driver,6000);    // This line is defined
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
		email.sendKeys("Testing");
		Thread.sleep(3000);
		//WebDriverWait wait1 = new WebDriverWait(driver,4000);
		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pass")));
		password.sendKeys("xyzndbsk");
		Thread.sleep(3000);
		//WebDriverWait wait2 = new WebDriverWait(driver,4000);
		WebElement login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("login")));
		login.click();
	}
	public static void main(String[] args) throws InterruptedException {
		TestExplicitWait objt = new TestExplicitWait();
		objt.DriverSetting();
		objt.testexplicitwait();
	}
}
