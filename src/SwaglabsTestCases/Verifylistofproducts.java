package SwaglabsTestCases;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Frameworkdemo.UtilityTest;
import SwaglabsRepository.Homepage;
import SwaglabsRepository.LoginPage;

public class Verifylistofproducts extends UtilityTest {
	LoginPage objloginpage = new LoginPage();
	Homepage objhomepage = new Homepage();
	ArrayList<String> explistofproducts = dataread("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx","Sheet4",0); 
	ArrayList<String> usernames = dataread("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx","Sheet1",0); 
	ArrayList<String> passwords = dataread("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx","Sheet1",1);
	@Test(priority=1)
	public void initbrowser()
	{
		DriverSetting();
	}
	@Test(priority=2)
	public void login()
	{
		starttestcase("Verify list of all products");
		ArrayList<String> actuallist = new ArrayList<String>();
		for(int i=0; i<usernames.size(); i++) // loop to verify list of all valid usernames
		{
			elementfinder(objloginpage.username).sendKeys(usernames.get(i));
			elementfinder(objloginpage.password).sendKeys(passwords.get(i));
			elementfinder(objloginpage.loginbutton).click();
			markstatus("info", "Testing the list with user - "+ usernames.get(i));
			List<WebElement> allproducts =driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
			for(int j=0; j<allproducts.size(); j++) //loop to pick a text of all products
			{
				String temp = allproducts.get(j).getText();
				actuallist.add(temp);
			}
			for(int a=0; a<explistofproducts.size(); a++) //loop to compare actual and expected list
			{
				compare(explistofproducts.get(a), actuallist.get(a),
						"Product displayed successfully - "+actuallist.get(a),
						"Product not displayed successfully - "+actuallist.get(a));
			}
			actuallist.clear();
			elementfinder(objhomepage.menu).click();
			elementfinder(objhomepage.logoutbtn).click();
		}
		driver.close();
	}
}


