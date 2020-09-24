package SeleniumNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDwon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.findElement(By.xpath("//*[@class='multiselect-selected-text']")).click();
List<WebElement> element =driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//a//label"));
System.out.println(element.size());

for(int i=0;i<element.size();i++)
{
	if(!(element.get(i).isSelected())) {
	element.get(i).click();}
	
}

	}}


