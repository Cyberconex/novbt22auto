package myseleniumpakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	public void assertionDemo1() {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expected="Facebook – log in or sign up";
		Assert.assertEquals(driver.getTitle(),expected );
	
		
	}
	@Test
	
	public void assertionDemo2() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		 //Assert.assertEquals("AutomationTesting","AutomationTesting" );
		System.out.println("Test git");
	}
@Test
	
	public void assertionDemo3() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		 //Assert.assertEquals("AutomationTesting","AutomationTesting" );
		System.out.println("Test git");
	}
}
