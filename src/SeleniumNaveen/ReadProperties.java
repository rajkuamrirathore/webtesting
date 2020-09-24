package SeleniumNaveen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/rajkumari.rathore/eclipse-workspaceraj/Webtesting/src/SeleniumNaveen/config.properties");
		prop.load(ip);
		String url =prop.getProperty("URL");
		String browsername = prop.getProperty("Browsername");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver 2"); }
			WebDriver driver = new ChromeDriver();
			driver.get(url);
		
		
	driver.findElement(By.name(prop.getProperty("firstname_name"))).sendKeys("firstname");
	driver.findElement(By.name(prop.getProperty("lastname_name"))).sendKeys("lastname");

	}

}
