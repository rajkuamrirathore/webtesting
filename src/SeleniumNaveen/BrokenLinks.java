package SeleniumNaveen;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://makemysushi.com/404?");
		
		
		//find the total no of links +images
		List<WebElement> list= driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		
		//printing the total number
		System.out.println(list.size());
		
		//creating empty list for active links
		List<WebElement> activelist = new ArrayList<WebElement>();
		//interating to gather only the active links
		for(int i=0;i<list.size();i++)
		{
			if((list.get(i).getAttribute("href")!=null) && (!list.get(i).getAttribute("href").contains("javascript")))
					{
				activelist.add(list.get(i));
					}
		}
		
		System.out.println(activelist.size());

		//iterting through active links to get the connect 
		for(int j=0;j<activelist.size();j++) {
			HttpURLConnection connection =(HttpURLConnection)new URL(activelist.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String mesage =connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelist.get(j).getAttribute("href")+"------->"+mesage);
	}

}}
