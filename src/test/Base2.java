package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
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

	@Test(dataProvider = "getData")
	public void DataProvider(String username,String password) {
		System.out.println("BfSiute");
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2]; // 3 rows and 2 columns
//		1st set
		data[0][0] = "username1";
		data[0][1] = "password1";

//		2nd set
		data[1][0] = "username2";
		data[1][1] = "password2";
//		3rd set
		data[2][0] = "username3";
		data[2][1] = "password3";

		return data;
	}
}
