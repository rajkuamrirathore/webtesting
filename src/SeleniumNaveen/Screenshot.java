package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("u_0_b"));
clickon(driver,driver.findElement(By.id("u_0_b")),20);
	}
	
	
	public static void clickon(WebDriver driver, WebElement locator, int timeout)
	{
		new WebDriverWait(driver,timeout)/*.ignoring(StaleElementReferenceException.class)*/.
		until(ExpectedConditions.elementToBeClickable(locator));
		
	}

}
