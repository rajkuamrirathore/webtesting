package SeleniumNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		System.out.println(driver.getTitle());

	}

}
