import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XYZ {
 WebDriver driver;

public void settingmethod() {
	System.setProperty("Webdriver.chrome.driver","");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
public void selenium() {
	driver.get("www.google.com");
	driver.findElement(By.name("email")).sendKeys("Sadhanaauti93@gmail.comm");
	driver.findElement(By.name("password")).sendKeys("casdafg");
	driver.findElement(By.name("submit")).click();
}
public static void main(String[] args) {
	XYZ obj = new XYZ();
	obj.settingmethod();
	obj.selenium();
 }
}             
