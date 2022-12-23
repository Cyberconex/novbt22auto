package myseleniumpakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyTestNGTests {
	WebDriver driver;

	/*
	 * @BeforeMethod public void LaucnhBroswer() { // driver = new ChromeDriver();
	 * // System.out.println("LaucnhBroswer"); System.out.println("@BeforeMethod");
	 * 
	 * }
	 */

	@Test
	public void openApplication() {
		// driver.get("https://www.google.com/");
		System.out.println("@ test1");
	}
	/*
	 * @Test public void MA1() { // System.out.println("Methodc");
	 * System.out.println("@Test");
	 * 
	 * }
	 * 
	 * @Test public void M2() { // System.out.println("Methodc");
	 * System.out.println("@Test2");
	 * 
	 * }
	 * 
	 * @AfterMethod public void quit() { // System.out.println("Methodc");
	 * System.out.println("@AfterMethod");
	 * 
	 * }
	 */
}
