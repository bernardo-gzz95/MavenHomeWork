package pages;

import org.openqa.selenium.By;

import Accenture.Homework.DriverMethods;

public class OracleJavaDocsHome extends DriverMethods{
	private static String text, windowHandle;
	protected static String leftUpperPanelNameFrame = "packageListFrame";
	protected static String leftLowerPanelNameFrame = "packageFrame";
	protected static String rightInterfaceNameFrame = "classFrame";
	
	public static String TablePackageDescription(String packageName){
		windowHandle = driver.getWindowHandle();
		driver.switchTo().frame(rightInterfaceNameFrame);
		String xpath = String.format("//table[@class='overviewSummary']//a[text()='%s']/parent::td/following::td[1]/div", packageName);
		text = driver.findElement(By.xpath(xpath)).getText();
		driver.switchTo().window(windowHandle);
		return text;
	}
	
	public static void AllClasesMenuClick(String className){
		windowHandle = driver.getWindowHandle();
		driver.switchTo().frame(leftLowerPanelNameFrame);
		String xpath = String.format("//div[@class='indexContainer']//a[text()='%s']", className);
		driver.findElement(By.xpath(xpath)).click();
		driver.switchTo().window(windowHandle);
	}
	
	
	public static String TitleText(){
		windowHandle = driver.getWindowHandle();
		String title = "";
		driver.switchTo().frame(rightInterfaceNameFrame);
		String xpath = "//div[@class='header']//h2[@class='title']";
		title = driver.findElement(By.xpath(xpath)).getText();
		driver.switchTo().window(windowHandle);
		return title;
	}
	
}
