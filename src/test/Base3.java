package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base3 {

	@Test
	public void MobileAPILogin() {
		System.out.println("MobileAPILogin");
	}

	@Test
	public void MobileLoginPassword() {
		System.out.println("MobileLoginPassword");
	}

	@Test
	public void MobileAPILogout() {
		System.out.println("MobileAPILogout");
	}

	@Test
	public void WebLoginPassword() {
		System.out.println("WebLoginPassword");
	}

	@BeforeTest
	public void BeforeTestRun() {
		System.out.println("Run First");
	}

}
