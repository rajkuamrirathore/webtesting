package SeleniumNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DynamicWebTable {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rajkumari.rathore/Downloads/chromedriver");
		WebDriver driver = new HtmlUnitDriver();
		/*driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		String xpath = "//table/tbody/tr[1]/td[2]";
		String fristhalf = "//table/tbody/tr[";
		String seconghalf = "]/td[";
		String thirdhalf = "]";
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=2;j++) {
	      String zu = driver.findElement(By.xpath(fristhalf + i + seconghalf + j + thirdhalf)).getText();
	      System.out.println(zu);
	     if(zu.equalsIgnoreCase("fourth cell"))
	    	  System.out.println(driver.findElement(By.xpath(fristhalf + i + thirdhalf )).getText());
		}
	      
		} */
	driver.get("http://demo.guru99.com/test/accessing-nested-table.html");
String name=	driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/parent::tr//preceding-sibling::tr//")).getText();
	      //table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2];
System.out.println(name);
	      
		
	}

}
