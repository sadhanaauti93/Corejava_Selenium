package Frameworkdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Testcase extends UtilityTest 
	{
		ObjectRepository objo = new ObjectRepository();
		@Test(priority=1)
		public void initbrowse() 
		{
			DriverSetting();
		}
		@Test(priority=2)
		public void navigate() 
		    {
			//driver.get("https://www.facebook.com/");
			//driver.findElement(objr.emailtextbox).sendKeys("starset.1413@gmail.com");	//BY is class ki method .and name-> return types is by class ka object //objr.emailtextbox by class object
			//driver.findElement(objr.password).sendKeys("Anterwali@17s");
			elementfinder(objo.emailtextbox).sendKeys("Testing");
		}
}
