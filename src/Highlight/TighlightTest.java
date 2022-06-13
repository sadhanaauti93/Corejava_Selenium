package Highlight;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TighlightTest {
	WebDriver driver;
	public void driversetting() {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
	//"C:\\Users\\SADGHADG\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();	
	driver.manage().window().maximize();
	}
	public void Hightlight() {
	driver.get("https://www.gmail.com");
	WebElement ele = driver.findElement(By.xpath("//*[@id='Email']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}
	public static void main(String[]  args) {
		TighlightTest obj = new TighlightTest();
		obj.driversetting();
		obj.Hightlight();
	}
}

