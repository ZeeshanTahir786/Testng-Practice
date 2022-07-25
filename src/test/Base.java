package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Base {

//	public static void main(String[] args) {
//		
//	}
	@Test
	public void name() {
		System.out.println("Hell");
	}

	@Test
	public void name2() {
		System.out.println("name 2");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("i will run after set");
	}
}
