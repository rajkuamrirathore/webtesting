package SeleniumNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		// frames can be handled in two ways by index and by value
		driver.switchTo().frame(1);// giving the index of the frame
		driver.switchTo().frame("");// giving the frame name

	}

}
