package ExcelRead;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TestReadFile 
{
	public void dataread() 
	{
		try
		{
			FileInputStream Fs = new FileInputStream("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx");
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver_win32 (2)\\chromedriver.exe");
			XSSFWorkbook workbook = new XSSFWorkbook(Fs);
			XSSFSheet objsheet = workbook.getSheetAt(0);  //Value identify   //getsheet--> addintify the string
			int rowcount = objsheet.getLastRowNum();  //Find the last row  //Return Type is "int"	//starting 0

			for(int i = 0; i<=rowcount;i++) 
			{
				XSSFRow row = objsheet.getRow(i);
				int cellcount = row.getLastCellNum();		//Find the last cell  //Return Type is "int"

				for(int j=0; j<cellcount;j++)
				{
					String value = row.getCell(j).getStringCellValue();   //"datatype" IN cell verfiy the data eg.String,int etc 
					System.out.println(value);
				}
			}
			workbook.close();
			Fs.close();
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TestReadFile  obj = new TestReadFile ();
		obj.dataread();

	}
}



