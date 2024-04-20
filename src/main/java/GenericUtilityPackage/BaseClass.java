package GenericUtilityPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeSuite
	public void configBeforeSuite() {

	}
	@BeforeTest
	public void configBeforTest() {

	}
	@BeforeClass
	public void configBeforeClass() {

	}
	@BeforeMethod
	public void configBeformethod() {

	}


	@AfterMethod
	public void configAfterMethod() {

	}
	@AfterClass
	public void configAfterClass() {

	}
	@AfterTest
	public void configAfteTest() {

	}
	@AfterSuite
	public void configAfterSuite() {

	}
}
