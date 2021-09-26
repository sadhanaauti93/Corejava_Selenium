package TestNG;
import org.testng.annotations.Test;
public class Basicoftestng 
{
	@Test(priority=-1, groups={"moneytransfer"})
	public void testmethod1() 
	{
		System.out.println("test method 1");
	}
	
	@Test(priority=5, groups={"statement"})			
	public void testmethod2()        
	{
		System.out.println("test method 2");  //<include name="statement" />
	}
	
	@Test(priority=0, groups={"moneytransfer","statement"})
	public void testmethod3() 
	{
		System.out.println("test method 3");
	}
}
