package SeleniumNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicCalender {
	static WebElement element=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.in/");
	WebElement element =   driver.findElement(By.xpath("//span[text()='Check in']"));
		String date = "2020-06-04";
		selectdate(element,driver,date);
		
	}	
		
		public static void selectdate(WebElement element, WebDriver driver, String date) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+date+"');", element);
		}
		
		
		
		
}
