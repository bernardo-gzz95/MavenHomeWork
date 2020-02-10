package Accenture.Homework;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import pages.Letskodeit;
import pages.OracleJavaDocsHome;

public class Tests extends TestsConfiguration{
WebElement element;
	

	@Test
	public void ejercicio2() throws InterruptedException {
		DriverMethods.GetURL("https://learn.letskodeit.com/p/practice");
		Letskodeit.MultipleSelect("Apple");
		Letskodeit.MultipleDeselect("Apple");
		Letskodeit.MultipleSelect("Orange");
		Letskodeit.MultipleDeselect("Orange");
		Letskodeit.MultipleSelect("Peach");
		Letskodeit.MultipleDeselect("Peach");
	}
	

	@Test
	public void ejercicio3() throws InterruptedException {
		DriverMethods.GetURL("https://learn.letskodeit.com/p/practice");
		Letskodeit.CheckboxExample("BMW");
		Thread.sleep(500);
		Letskodeit.CheckboxExample("Benz");
		Thread.sleep(500);
		Letskodeit.CheckboxExample("Honda");
		Thread.sleep(500);
	}
	
	@Test
	public void ejercicio4() throws InterruptedException {
		DriverMethods.GetURL("https://learn.letskodeit.com/p/practice");
		String text = Letskodeit.WebTableExample("3", "3");
		System.out.println("Price found: " + text);
	}
	
	
	@Test
	public void ejercicio6() throws InterruptedException {
		DriverMethods.GetURL("https://docs.oracle.com/javase/7/docs/api/");
		String text = OracleJavaDocsHome.TablePackageDescription("java.applet");
		System.out.println(text);
	}
	
	
	@Test
	public void ejercicio7() throws InterruptedException {
		String expectedText = "Class AbstractButton";
		DriverMethods.GetURL("https://docs.oracle.com/javase/7/docs/api/");
		OracleJavaDocsHome.AllClasesMenuClick("AbstractButton");
		String actualText = OracleJavaDocsHome.TitleText();
		assert actualText.equals(expectedText): "Title "+ actualText + "does not match the expected one";
	}

}
