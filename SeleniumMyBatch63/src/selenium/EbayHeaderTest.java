package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> ebay = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		System.out.println(ebay.size());
		
		for(int i =0; i<ebay.size(); i++)
			//System.out.println(ebay.get(i).getAttribute("value"));{
			System.out.println(ebay.get(i).getText());
	}

}