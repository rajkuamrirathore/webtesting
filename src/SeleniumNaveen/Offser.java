package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Offser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		
		WebElement source=	driver.findElement(By.id("draggable"));
		WebElement destination= 	driver.findElement(By.id("droppable"));
		int x1 =source.getLocation().getX();
		int y1=source.getLocation().getY();
		
		int x2= destination.getLocation().getX();
		int y2= destination.getLocation().getY();
		
	int	offx=(x2-x1)+10;
		int offy=(y2-y1)+10;
		Actions action = new Actions(driver);
		action.dragAndDropBy(source, offx, offy).perform();
	}

}
