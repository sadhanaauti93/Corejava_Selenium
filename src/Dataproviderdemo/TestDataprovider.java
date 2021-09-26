package Dataproviderdemo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TestDataprovider {
	@Test(priority=1, dataProvider = "testdata")
	public void test(int id, String password, String name)
	{
		System.out.println(" The id is " + id + " password is " + password + " name is " + name);
	}
	@DataProvider(name="testdata")
	public Object[][] dataprovidermethod()
	{
		return new Object[][]
				{
					{11, "pwd1","A"},
					{12, "pwd2","B"},
					{13, "pwd3","C"},
					{14, "pwd4","D"},
				};
	}

}
