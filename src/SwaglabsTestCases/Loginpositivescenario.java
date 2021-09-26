package SwaglabsTestCases;
import java.util.ArrayList;
import org.testng.annotations.Test;
import Frameworkdemo.UtilityTest;
import SwaglabsRepository.Homepage;
import SwaglabsRepository.LoginPage;

public class Loginpositivescenario extends UtilityTest
{
	LoginPage objloginpage = new LoginPage();
	Homepage objhomepage = new Homepage();
	ArrayList<String> usernames = dataread("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx","Sheet1",0); 
	ArrayList<String> password = dataread("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx","Sheet1",1); 
	String exphomeurl = "https://www.saucedemo.com/inventory.html";
	@Test(priority=1)
	public void initbrowser()
	{
		DriverSetting();
	}
	@Test(priority=2)
	public void login()
	{
		starttestcase("Login positive scenario");
		for(int i=0; i<usernames.size();i++)
		{
			elementfinder(objloginpage.username).sendKeys(usernames.get(i));
			elementfinder(objloginpage.password).sendKeys(password.get(i));
			elementfinder(objloginpage.loginbutton).click();
			String actualurl = driver.getCurrentUrl();
			compare (exphomeurl, actualurl, "Login successful with user " + usernames.get(i), "Login failed with user "+ usernames.get(i));
			elementfinder(objhomepage.menu).click();
			elementfinder(objhomepage.logoutbtn).click();
		}
		driver.close();
	}
}

