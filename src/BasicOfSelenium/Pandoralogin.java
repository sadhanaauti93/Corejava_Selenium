package BasicOfSelenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pandoralogin {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	public void navigate() {
		driver.get("https://account.similarweb.com/login");
		driver.findElement(By.name("username")).sendKeys("sadhanaauti93@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[4]/form/button")).click();
		driver.close();
	}
	public static void main(String[] args) {
		Pandoralogin obj = new Pandoralogin();
		obj.DriverSetting();
		obj.navigate();
	}
}
