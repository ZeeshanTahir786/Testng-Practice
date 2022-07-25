package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Base2 {

	@BeforeSuite
	public void BfSIute() {
		System.out.println("BfSiute");
	}

	@Test(groups = { "Smoke" })
	public void name3() {
		System.out.println("Hell 3");
	}

	@Test(enabled = false) // if you dont want to run any specific test case then this is the option for it
	public void name4() {
		System.out.println("name 4");
	}

	@AfterSuite
	public void AfSuite() {
		System.out.println("AfSuite");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("i will execute before every method of class Base2");
	}
}
