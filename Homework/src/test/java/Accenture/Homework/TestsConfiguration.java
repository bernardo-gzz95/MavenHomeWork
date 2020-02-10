package Accenture.Homework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class TestsConfiguration {
	protected WebDriver driver;
	@Before
	public void setUp() {
		driver = DriverMethods.SetChromeDriver();
		//driver = DriverMethods.SetGeckoDriver();
		//driver = DriverMethods.SetIEDriver();
	}
	
	@After
	public void tearDown() {
		DriverMethods.driver.quit();
	}
}
