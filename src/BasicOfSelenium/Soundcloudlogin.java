package BasicOfSelenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Soundcloudlogin {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	/*public void createaccount() {
		driver.get("https://soundcloud.com/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[2]/button[2]")).click();   //Click on create account
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[1]/div[1]/button")).click();
	}*/
	public void signin() {
		driver.get("https://soundcloud.com/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();  //Click on accept 
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[2]/button[1]")).click(); //click on sinin btn
		//driver.findElement(By.name("email")).sendKeys("sadhanaauti93@gmail.com");  //Click on mail id 
		driver.findElement(By.cssSelector("#app > div > div > div > div > div.provider-buttons > div:nth-child(1) > button")).click(); //Click facebook button
		driver.findElement(By.id("sign_in_up_submit")).click();

		driver.close();
	}
	public static void main(String[] args) {
		Soundcloudlogin obj = new Soundcloudlogin();
		obj.DriverSetting();
		obj.signin();
		//obj.createaccount();
	}
}