package SeleniumNaveen;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		
	List<WebElement> links =	driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++) {
		links.get(i).click();	
		}
	Set<String>	han=driver.getWindowHandles();
	Iterator<String> it=han.iterator();
	while(it.hasNext())
	{
		String Win = it.next();
		driver.switchTo().window(Win);
		System.out.println(driver.getTitle());
		driver.close();
	}
		
		
		
	/*	driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Set<String> win = driver.getWindowHandles();
	Iterator<String> it =	win.iterator();
	String parent = it.next();
	System.out.println("parent id is "+parent);
	String child1 = it.next();
	System.out.println("child1 id is "+child1);
	String child2 = it.next();
	System.out.println("child2 id is "+child2);
	driver.switchTo().window(child2);
	driver.close();
	driver.switchTo().window(child1);
	driver.close();
	driver.switchTo().window(parent); */
	}

}
