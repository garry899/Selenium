package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		//WebElement header = driver.findElement(By.className("_yb_cxbxk"));
		
		//List<WebElement> allList = driver.findElements(By.xpath("//ul[contains(@class,'_yb_2qgi4 _')]/li"));
		

		List<WebElement> allList = driver.findElements(By.xpath("//ul[@role='presentation']//a"));
		
		System.out.println(allList.size());
		for(int i=0;i<allList.size();i++) {
		
		System.out.println(allList.get(i).getText());
		}

	}

}
