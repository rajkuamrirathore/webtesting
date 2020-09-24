package SeleniumNaveen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		
		
		
		//used to wait until the page is page, once the page is loaded though u have given 40 sections if the page is loaded in 10 sec then rest 30 seconds will be waved off
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		//used for the elemnt to be loaded
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}
