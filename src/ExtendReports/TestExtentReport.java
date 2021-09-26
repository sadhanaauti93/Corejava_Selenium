package ExtendReports;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestExtentReport {
	WebDriver driver;
	ExtentHtmlReporter htmlreport;
	ExtentReports report;
	ExtentTest logger;
	@Test(priority=2)
	public void driversetting() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		htmlreport = new ExtentHtmlReporter(("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Extendreports\\SampleReports\\reportlatest__"+timestamp+".html"));	 //As per your file path  +("\\ExtentResult.html")  
		report = new ExtentReports();
		report.attachReporter(htmlreport);
	}
	@Test(priority=2)
	public void testalert() {
		String expectedresult = "Test message";  				//As per your project display massage  
		logger = report.createTest("Basic popup testing");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		logger.log(Status.INFO, "Navigate to website");     
		driver.findElement(By.name("proceed")).click();
		Alert objalert = driver.switchTo().alert();
		logger.log(Status.INFO, "Alert genrated successfully");
		String actualresult = objalert.getText();
		objalert.dismiss();
		driver.switchTo().defaultContent();  //Switches to the  control main web page 
		logger.log(Status.PASS, "Alert text message display sucessfully");
		if(expectedresult.equals(actualresult))
		{
			logger.log(Status.PASS, "Alert text message display sucessfully");
		}
		else
		{
			logger.log(Status.FAIL, "Alert message mismatch");
		}
		logger = report.createTest("Second test case");
		logger.log(Status.PASS, "Simple tesr caes pass two");
		report.flush(); 	// close use the flush stream close WebDriver
		logger = report.createTest("Do pratices");
	}
	
}
















