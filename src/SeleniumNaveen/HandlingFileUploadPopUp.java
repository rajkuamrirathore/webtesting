package SeleniumNaveen;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		Thread.sleep(5000);
		
		//as these pop is not related to the browser use other method do not click on the browse/upload/choose file instead send the path of the file to be uploaded 
		
		driver.findElement(By.name("fileupload")).click();//sendKeys("Users⁩//rajkumari.rathore⁩//Downloads⁩//original.json");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
	//System.out.println(frames.size());

	}

}
