package Frameworkdemo;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	public class UtilityTest {
	public WebDriver driver;
	public static ExtentHtmlReporter htmlreport;
	public static ExtentReports report;
	public static ExtentTest logger;
	String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
	String Browsername; 					//String is java defined class
	String Applicationlink;
	public void  DriverSetting() 			//DriverSetting
	{
		// Read browser name and link excel
		try 
		{
			FileInputStream Fs = new FileInputStream("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(Fs);
			XSSFSheet objsheet = workbook.getSheet("sheet2");
			XSSFRow row = objsheet.getRow(1);
			Browsername = row.getCell(0).getStringCellValue();   	//Value identify//getsheet --> identify the string
			Applicationlink = row.getCell(1).getStringCellValue();
			workbook.close();
			Fs.close();
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		if(Browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browsername.equalsIgnoreCase("firefox"))
		{
			//Code to open firefox browser
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get(Applicationlink);
	}
	public WebElement elementfinder(By objby) {
		WebElement temp = driver.findElement(objby);
		return temp;
	}
	@BeforeSuite
	public void initreport() {
		htmlreport = new ExtentHtmlReporter(("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Extendreports\\SampleReports\\reportlatest__"+timestamp+".html"));	 //As per your file path  +("\\ExtentResult.html")  
		report = new ExtentReports();
		report.attachReporter(htmlreport);
	}
	public void starttestcase(String Testcasename) {
		logger = report.createTest(Testcasename);
	}
	@AfterSuite
	public void endreport()
	{
		report.flush();
	}
	public void markstatus(String statusname, String description) {
		if(statusname.equalsIgnoreCase("pass"))
		{
			logger.log(Status.PASS, description);
		}
		else if(statusname.equalsIgnoreCase("fail")) 
		{
			logger.log(Status.FAIL, description);
		}
		else if(statusname.equalsIgnoreCase("info")) 
		{
			logger.log(Status.INFO, description);
		}
	}
	public void compare(String expected, String actual, String passmessage, String failmessage)
	{
		if(expected.equals(actual))
		{
			markstatus("pass", passmessage);
		}
		else
		{
			markstatus("fail", failmessage);
		}
	}
	public ArrayList<String> dataread(String filepath, String sheetname, int cellno)
	{
		ArrayList<String> obja = new ArrayList<String>();
	try
		{
		FileInputStream Fs = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(Fs);
		XSSFSheet objsheet = workbook.getSheet(sheetname);
		int rowcount  = objsheet.getLastRowNum();
		for(int a=1; a<=rowcount; a++) 
		{
		XSSFRow row = objsheet.getRow(a);
		String temp = row.getCell(cellno).getStringCellValue();
		obja.add(temp);
		}
		workbook.close();
		Fs.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return obja;
   }
}

