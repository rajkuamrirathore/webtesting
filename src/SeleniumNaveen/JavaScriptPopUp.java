package SeleniumNaveen;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//	Thread.sleep(5000);
		driver.findElement(By.name("proceed")).click(); // clicking on the button which will give pop up menu
		
		//right now we need to switch btw two windows from the html to the javascript pop up so use switch method here
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); // get the alert text
		alert.accept();// click on the ok button of the alert means accepting the alert
	//	alert.dismiss();// clicking on the cancel button of the pop, means not accepting the alert popup
	
		
	
	}
	

}
