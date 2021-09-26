package DhanoNavigate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestNavigate {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	public void TestNavigation() throws InterruptedException {
		Navigation obj = driver.navigate();    //Navigation is a Selenium defined class
		obj.to("https://www.facebook.com/");
		//Thread.sleep(3000);
		obj.to("https://www.google.co.in/");
		//Thread.sleep(3000);
		obj.back();
		//Thread.sleep(3000);
		obj.refresh();
		//Thread.sleep(3000);
		obj.forward();
	}
	public static void main(String[] args) throws InterruptedException {
		TestNavigate objT = new TestNavigate();
		objT.DriverSetting();
		objT.TestNavigation();
	}
}
