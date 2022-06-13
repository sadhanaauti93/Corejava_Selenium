package BasicOfSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
	}
	public void navigate() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_2')]")).click();
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select objm = new Select(monthdropdown);
		objm.selectByValue("3");					 // When value is fix
		//objm.selectByVisibleText("Feb");    		//Black font and text format
		//objm.selectByIndex(1);
		// When value is not fix Select By.Name("");
	}
	public static void main(String[] args) {
		dropdown obj = new dropdown();
		obj.DriverSetting();
		obj.navigate();
	}
}