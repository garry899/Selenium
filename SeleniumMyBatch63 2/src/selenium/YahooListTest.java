package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://ca.yahoo.com/");
		
		//List<WebElement> allList = driver.findElements(By.xpath("//div[contains(@class,'c-list-row')]/div/a"));
		

		List<WebElement> allList = driver.findElements(By.xpath("//div[@class='bd']//a"));
		//WebElement trendingElement= driver.findElement(By.className("bd"));
		//List<WebElement> trendingElementList=trendingElement.findElements(By.tagName("a"));
		
		System.out.println(allList.size());
		for(int i=0;i<allList.size();i++) {
			System.out.println(allList.get(i).getText());
		}

	}

}
