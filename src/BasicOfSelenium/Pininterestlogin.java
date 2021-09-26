package BasicOfSelenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pininterestlogin {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	public void Loginpin() {
		driver.get("https://in.pinterest.com/login/");
		driver.findElement(By.id("email")).sendKeys("sadhanaauti93@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Anterwali@13s");
		driver.findElement(By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div[3]/div/div/div[3]/form/div[5]/button/div")).click();  //Click on login button
		driver.findElement(By.xpath("//*[@id=\"__PWS_ROOT__\"]/div[1]/div/div/div[3]/div/div/div[3]/form/div[3]/div/a")).click();  //Click on forgot p/w
		driver.findElement(By.id("password"));
		//driver.close(); 
	}
	public static void main(String[] args) {
		Pininterestlogin objp = new Pininterestlogin();
		objp.DriverSetting();
		objp.Loginpin();
	}

}
