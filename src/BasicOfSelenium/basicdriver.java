package BasicOfSelenium;
import java.sql.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class basicdriver {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
	driver.manage().window().maximize();
	}
	public void navigate() {
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("starset.1413@gmail.com");	//This is the Invalid test caeses
	driver.findElement(By.id("pass")).sendKeys("Anterwali@12323s");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.name("pass")).click();
	
//	driver.findElement(By.name("firstname")).sendKeys("Moni");
//	driver.findElement(By.name("lastname")).sendKeys("Ghadge");
//	driver.findElement(By.id("u_a_g_vj")).sendKeys("9834174926");
//  driver.findElement(By.name("reg_passwd__")).sendKeys("Anterwali@13s");
	
	WebElement monthdropdown = driver.findElement(By.id("month"));  //Montrh dropdown in facebook
	Select objm = new Select(monthdropdown);
	 objm.selectByValue("2");

	
	/*WebElement textbox = driver.findElement(By.id("email"));
			textbox.sendKeys("sadhanaauti92@gmail.com");	//This is the Invalid test caeses*/
	
	}	
	public static void main(String[] args) {
		basicdriver bs = new basicdriver();
		bs.DriverSetting();
		bs.navigate();
	}
	
}
