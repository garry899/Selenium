package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		
		List<WebElement> popUp1 = driver.findElements(By.xpath("//div[contains(@class,'_2KpZ6l ')]"));
		
		if(popUp1.size()>0) {
			WebElement closeButton = driver.findElement(By.xpath("//div[contains(@class,'_2KpZ6l ')]"));
			closeButton.click();
		}
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();//to hover mouse to element
		
		Thread.sleep(2000);
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[contains(@class,'7qr1OC')]/a"));
		System.out.println(allList.size());
		
		for(WebElement a:allList) {
			System.out.println(a.getText());
		}
	}

}
