package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("JAVA");
		//driver.quit();
		// xpath starts //tagname[@class/name='value']
		// now if ur searching by id name and the id field is dynamic an it keeps on chnage then u can use one method in xpath called
		//contains which u can specify
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-')]")).sendKeys("JAVA");
		driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb ui-autocomplete-')]")).sendKeys("JAVA");
		driver.findElement(By.xpath("//input[ends-with(@class,'gh-tb ui-autocomplete-')]")).sendKeys("JAVA");
		
		
		
		//for links only--custom xpath
		driver.findElement(By.xpath("//a[contains(text(),'My-account')]")).click();
		
	
	//	disadvantages of absolute xpath
		// 1 can be changed any time in future
		//2 not reliable 3 performance issue
		
		
	}
	

}
