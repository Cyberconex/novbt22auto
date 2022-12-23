package myseleniumpakg;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGAnnotationsDemo {
	/*
	 * @BeforeSuite public void beforeSuite() { System.out.println("beforeSuite"); }
	 * 
	 * @BeforeTest public void beforeTest() { System.out.println("beforeTest"); }
	 * 
	 * @BeforeClass public void beforeClass() { System.out.println("beforeClass"); }
	 * 
	 * @AfterTest public void afterTest() { System.out.println("AfterTest"); }
	 * 
	 * @AfterSuite public void afterSuite() { System.out.println("AfterSuite"); }
	 * 
	 * @AfterClass public void afterClass() { System.out.println("afterClass"); }
	 */

	@Test(dependsOnMethods = "testCase2")
	public void testCase1() {
		System.out.println("Test1");
	}

	@Test(groups = {"myTests1","myTests2"})
	public void testCase2() {
		System.out.println("Test2");
	}
	@Test(priority = 2)
	public void testCase3() {
		System.out.println("Test3");
	}


	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
}
