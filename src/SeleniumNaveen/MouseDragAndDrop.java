package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);// moving to the frame if present
		
		//t drag and drop an element need to use action class
		Actions action = new Actions(driver);
	//	action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		//here i am clicking and holding the elemnt and then moving to the elemnt where i need to drop and then releasing it.
        
		
		//or directly use drag and drop
	WebElement source=	driver.findElement(By.id("draggable"));
	WebElement destination= 	driver.findElement(By.id("droppable"));
		
	action.dragAndDrop(source, destination).perform()	;
		
		//driver.quit();
	}

}
