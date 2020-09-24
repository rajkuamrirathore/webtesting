package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDrag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// to maximize the window opened
		driver.manage().deleteAllCookies();// for deleting the cookies
		
		
		
		

		driver.get("https://www.spicejet.com/");
		int size= driver.findElements(By.tagName("frame")).size();
		System.out.println(size);
		Actions action = new Actions(driver);// used for the mouse movement
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).perform();// to over over the element
		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'SpiceMax ')]"));
		
		//driver.findElement(By.linkText("SpiceMax ")).click();// click on the element found after hovering on the element
		driver.quit();

	}

}
