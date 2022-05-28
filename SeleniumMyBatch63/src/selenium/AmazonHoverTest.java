package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		Thread.sleep(2000);
		
		//hover on account and list
		WebElement hover = driver.findElement(By.className("nav-line-1-container"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(hover).build().perform();//to hover mouse to element
		
		Thread.sleep(2000);;
		
		List<WebElement> yourList = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(yourList.size());
		for(WebElement a :yourList) { 
			System.out.println(a.getText()); 
			}
		//size and text of left table

	}

}
