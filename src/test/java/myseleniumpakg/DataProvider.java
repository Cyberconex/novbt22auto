package myseleniumpakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider {

	@Parameters("browser")
	@Test
	public void Setbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			WebDriver driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("Edge")) {
			
			WebDriver driver= new EdgeDriver();

			System.out.println("Test git");

		}

	}
}
