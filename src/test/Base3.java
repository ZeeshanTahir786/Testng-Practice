package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base3 {

	@Parameters({ "Url" })
	@Test
	public void MobileAPILogin(String urlName) {
		System.out.println("MobileAPILogin");
		System.out.println(urlName);
	}

	@Test(groups = { "Smoke" })
	public void MobileLoginPassword() {
		System.out.println("MobileLoginPassword");
	}

	@Test
	public void MobileAPILogout() {
		System.out.println("MobileAPILogout");
	}

//	These are called "Helper Attributes"

	// New the MobileAPILogout method depends on
	// WebLoginPassword method.. first
	// MobileAPILogout will execute then
	// WebLoginPassword will execute
	@Test(dependsOnMethods = { "MobileAPILogout", "MobileAPILogin" })
	public void WebLoginPassword() {
		System.out.println("WebLoginPassword");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("i will execute before every method of class Base3");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("i will execute After every method of class Base3");
	}

	@BeforeTest
	public void BeforeTestRun() {
		System.out.println("Run First");
	}

}
