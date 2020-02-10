package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Accenture.Homework.DriverMethods;

public class Letskodeit extends DriverMethods{
	private static WebElement webElement;

	/**
	 * Select the desired option by visible text and verify that its selected
	 * @param option
	 */
	public static void MultipleSelect(String text) {
		webElement = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
		Select select = new Select(webElement);
		String xpath = String.format("//select[@id='multiple-select-example']/option[text()='%s']", text);
		driver.findElement(By.xpath(xpath)).click();
		String selectedOption = select.getFirstSelectedOption().getText();
		assert text.equals(selectedOption): "The indicated tag [" + text + "] was not selected";
	}
	
	/**
	 * Deselect the option by using the visible text
	 * @param text
	 */
	public static void MultipleDeselect(String text) {
		String xpath = String.format("//select[@id='multiple-select-example']/option[text()='%s']", text);
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public static void CheckboxExample(String text) {
		text = text.toLowerCase();
		String xpath = String.format("//legend[text()='Checkbox Example']/following::label/input[contains(@value,'%s')]", text);
		webElement = driver.findElement(By.xpath(xpath));
		webElement.click();
		boolean selected = webElement.isSelected();
		assert selected == true: "The current option was not selected";
	}
	
	public static String WebTableExample(String row, String column) {
		String xpath = String.format("//table[@id='product']//tr[%s]/td[%s]", row, column);
		return driver.findElement(By.xpath(xpath)).getText();
	}
}
