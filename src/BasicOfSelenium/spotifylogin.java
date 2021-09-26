package BasicOfSelenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spotifylogin {
	WebDriver driver;
	public void DriverSettings() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	public void signupandDDown() {

		driver.get("https://www.spotify.com/us/signup/");	
		driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click(); //click on pop up
		
		driver.findElement(By.id("email")).sendKeys("sadhanaauti93@gmail.com");
		driver.findElement(By.id("confirm")).sendKeys("sadhanaauti93@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Anterwali@20s");
		driver.findElement(By.id("displayname")).sendKeys("Sadhana");
	}
	public void dropdown() {
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select objm = new Select(monthdropdown);
		objm.selectByIndex(7);
		
		driver.findElement(By.id("day")).sendKeys("27");
		driver.findElement(By.id("year")).sendKeys("2021");
		//driver.findElement(By.id("gender_option_female")).click();
		driver.findElement(By.cssSelector(".eQkHBW")).click();
		driver.findElement(By.cssSelector(".Radio-fatlcr-0:nth-child(2) .Indicator-sc-16vj7o8-0")).click();
		driver.findElement(By.cssSelector(".Indicator-sc-11vkltc-0")).click();  
		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();
		}
	public static void main(String[] args) {
		spotifylogin objs = new spotifylogin();
		objs.DriverSettings();
		objs.signupandDDown();
		objs.dropdown();
	}
}
