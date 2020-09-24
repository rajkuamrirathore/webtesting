package SeleniumNaveen;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	driver.findElement (By.name("q")).sendKeys("testing");
	
	List<WebElement> list =	driver.findElements(By.xpath("//ul[@class='erkvQe']/li/descendant::div[@class='sbl1']"));
System.out.println(list.size());
for(int i=0;i<list.size();i++)
{
	String names= list.get(i).getText();
	System.out.println(names);
	if(names.equalsIgnoreCase("testing life cycle")) {
		list.get(i).click();
	break;
}}

	}

}
