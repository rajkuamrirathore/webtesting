package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		// webdriver is an iterface all other drivers(chrome, firefox) are classes which are implemeting the interface
		// System is a class and set property is a method
		// for windows :: //Users//rajkumari.rathore//Downloads//chromedriver.exec becoz in windows u need to enter two slahes(//)  and add .exec
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/bangalore");
		
		//get the title of the page
/*	String title = 	driver.getTitle();
	System.out.println(title);
	
	System.out.println(driver.getCurrentUrl());
//	System.out.println(driver.getPageSource());
	//compare the actual result to expected--comparing two strings
	if(title.equalsIgnoreCase("google"))
	
		System.out.println("correct");
	else
		System.out.println("incorrect");
	
		driver.quit();  /// to close the browser opened  */
WebElement title =driver.findElement(By.xpath("(//p[@class ='sc-1hez2tp-0 sc-kzfUGa frVSvD'])[1]"));
		System.out.println(title.getText());

	}

}





//download safari extension safari webdriver extension add in safari preferences
// allow remote automation 



//https://stackoverflow.com/questions/41629592/macos-sierra-how-to-enable-allow-remote-automation-using-command-line
//https://developer.apple.com/documentation/webkit/testing_with_webdriver_in_safari
