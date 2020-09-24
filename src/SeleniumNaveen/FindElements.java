package SeleniumNaveen;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		
		// to find the no of links and get the text of all those from one particular page
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0;i<linklist.size();i++)
		{
		System.out.println(	linklist.get(i).getText());
			
		}
		driver.quit();
	}

}
