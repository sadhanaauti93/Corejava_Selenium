package SwaglabsTestCases;
import java.util.ArrayList;
import org.testng.annotations.Test;
import Frameworkdemo.UtilityTest;
import SwaglabsRepository.LoginPage;

public class Loginnegativescenario extends UtilityTest
{
	LoginPage objloginrepo = new LoginPage();

	ArrayList<String> usernames = dataread("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx","Sheet3",0);
	ArrayList<String> password = dataread("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx","Sheet3",1); 
	String experroemsg = "Epic sadface: Username and password do not match any user in this service";
	@Test(priority=1)
	public void initbrowser()
	{
		DriverSetting();
	}
	@Test(priority=2)
	public void login()
	{
		starttestcase("Login negative scenario");
		for(int i=0; i<usernames.size();i++)
		{
			elementfinder(objloginrepo.username).sendKeys(usernames.get(i));
			elementfinder(objloginrepo.password).sendKeys(password.get(i));
			elementfinder(objloginrepo.loginbutton).click();
			String actualerrormsg = elementfinder(objloginrepo.incorrectcredentialserrormessage).getText();
			compare (experroemsg , actualerrormsg, "Error message is displayed correctly for user -"+usernames.get(i), "Error message is not displayed correctly for user -"+usernames.get(i));

		}
		driver.close();
	}
}


