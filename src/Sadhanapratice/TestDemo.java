package Sadhanapratice;

import org.testng.annotations.Test;

public class TestDemo {
	@Test (priority= 3, groups={"savingaccount"})
	public void method1() 
	{
		System.out.println("welcome1");
	}
	@Test(priority= 2, groups={"currentaccount"})
	public void method2()
	{
		System.out.println("welcome2");
	}
	@Test(priority= 1,groups={"salaryaccount"})
	public void method3()
	{
		System.out.println("welcome3");
	}
}
