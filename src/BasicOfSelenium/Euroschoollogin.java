package BasicOfSelenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Euroschoollogin {
	WebDriver driver;
	public void DriverSetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.manage().window().maximize();
	}
	public void schoolreg() {
		//driver.get("https://www.euroschoolindia.com/euroschools-admissions/pune-kharadi.php?utm_source=google_gz&utm_medium=search_cpc&utm_campaign=euroschool_kharadi&utm_source=google_gz&utm_medium=search_cpc&utm_campaign=euroschool_kharadi&utm_content=%2Bonline%20%2Bschool_c&gclid=CjwKCAjwuvmHBhAxEiwAWAYj-GLomis4unkMnTne0ZhqLuQSA7kT6Nh5nEWG03V0EeoqhAw4SgCe4hoCALgQAvD_BwE");
		driver.get("https://www.euroschoolindia.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/a[1]")).click();  //Click on pop-up
		driver.findElement(By.xpath("//*[@id=\"section1\"]/div/div[3]/div[3]/div[1]/div[2]/div[2]/div[1]/a[2]")).click();
	
		WebElement academicyear = driver.findElement(By.name("AcademicYear"));   //Select Year
		Select objy = new Select(academicyear);
		objy.selectByIndex(1);  //done   or 2021-2022
		
		
		driver.findElement(By.name("First_Name")).sendKeys("Rushi");
		driver.findElement(By.name("Last_Name")).sendKeys("Sadhana");
		driver.findElement(By.name("Mobile")).sendKeys("9158376359");
		driver.findElement(By.name("Email")).sendKeys("sadhanaauti93@gmail.com");
		
		WebElement schoollist = driver.findElement(By.name("City"));   //Select school list
		Select objs = new Select(schoollist);
		objs.selectByIndex(7);
		
		WebElement selectboard = driver.findElement(By.name("Board"));   //Select board 
		Select objb = new Select(selectboard);
		objb.selectByIndex(1);
		
		WebElement greadlist = driver.findElement(By.name("Grade"));   //Select class
		Select objg = new Select(greadlist);
		//objg.selectByValue("Grade I");
		objg.selectByIndex(5);
		
		driver.findElement(By.id("chkreqcallbak")).click();  //Check box
		driver.findElement(By.id("school-admission-sub1")).click();   //Click on submit button
	}
	public static void main(String[] args) {
		Euroschoollogin obj = new Euroschoollogin();
		obj.DriverSetting();
		obj.schoolreg();
	}
}
