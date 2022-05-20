package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//List<WebElement> allList = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));

		List<WebElement> allList = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));
		// with //li it will skip on tag in between
		
		System.out.println(allList.size());
		for(int i=0;i<allList.size();i++) {
			System.out.println(allList.get(i).getText());
		}
		

	}

}
