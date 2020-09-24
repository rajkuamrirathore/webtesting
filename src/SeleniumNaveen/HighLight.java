package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLight {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement login =	driver.findElement(By.xpath("//input[@value='Log In']"));
		
		flash(login,driver);// to hightlight the elment
		
		drawborder(login,driver);// to add border
		
		//generateAlert
		alert(driver,"you idiot");
		//refresh browser
		refresh(driver);
	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor = element.getCssValue("backgroundColor");
		System.out.println(bgcolor);
		for(int i=0;i<100;i++) {
		changecolor("rgb(0,200,0)",element,driver);
		changecolor(bgcolor,element,driver);}
	}
	
	public static void changecolor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
	}
	
	public static void drawborder(WebElement element, WebDriver driver)
	{JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("arguments[0].style.border = '3px solid red'", element);
		
	}
	
	public static void alert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
		
	}
	
	
	public static void refresh(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("history.go(0)"); 
	}
	
}
