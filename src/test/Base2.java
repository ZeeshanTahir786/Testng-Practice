package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Base2 {

	@BeforeSuite
	public void BfSIute() {
		System.out.println("BfSiute");
	}
	@Test
	public void name3() {
		System.out.println("Hell 3");
	}
	@Test
	public void name4() {
		System.out.println("name 4");
	}
	@AfterSuite
	public void AfSuite() {
		System.out.println("AfSuite");
	}
}
