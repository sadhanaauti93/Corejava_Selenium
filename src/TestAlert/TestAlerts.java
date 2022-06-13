package TestAlert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestAlerts {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	public void testAlerts(){
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();	
		Alert objAlert = driver.switchTo().alert();
		String text = objAlert.getText();
		objAlert.dismiss();
		System.out.println(text);
	}
	public static void main(String[] args) {
		TestAlerts objA = new TestAlerts();
		objA.DriverSetting();
		objA.testAlerts();
	}
}
              