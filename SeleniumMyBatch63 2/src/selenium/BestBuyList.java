package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyList {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();		
		driver.get("https://www.bestbuy.ca/");
		
		Thread.sleep(2000);
		
		//hover on shop
		WebElement shop = driver.findElement(By.className("rootMenuItem_Qh9am"));
		shop.click();
		
		//size and text of all links
		List<WebElement> allList = driver.findElements(By.xpath("(//div[@data-automation='menu-main-l1'])[1]/a"));
		System.out.println(allList.size());
		for(WebElement a :allList) { 
			System.out.println(a.getText()); 
			}

	}

}
