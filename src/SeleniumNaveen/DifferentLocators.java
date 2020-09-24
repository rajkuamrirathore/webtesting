package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DifferentLocators {

	public static void main(String[] args) {
		// firepath and firebug plugin required for finding elements on firefox browser
		// different types of locator
		//1 xpath absoulte not used use only relative xpath  2
		//2 id                                               1
		//3 name										     3
		//4 link text -----<a> tag only for links
		//5 partial link text    n ot recommended
		// cssSelelctor---creating css selecctor (#{idvalue})= cssselector  or .#{classname}   2
		// class name not recommended                                       4
		//tag name
		
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.linkText("Create a business account")).click();

		
		// drop down static one
		Select select = new Select(driver.findElement(By.id("")));
		select.selectByVisibleText("");
		select.selectByIndex(3);
		select.deselectByValue("");
	}

}
