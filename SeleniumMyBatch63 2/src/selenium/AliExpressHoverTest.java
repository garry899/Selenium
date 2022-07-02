package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AliExpressHoverTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");

		List<WebElement> popUp1 = driver.findElements(By.className("btn-close"));
		//System.out.println(popUp1.size());
		
		if(popUp1.size()>0) {
			popUp1.get(0).click();
		}
		
		List<WebElement> popUp2 =driver.findElements(By.className("_24EHh"));
		//System.out.println(popUp2.size());
		
		if(popUp2.size()>0) {
			popUp2.get(0).click();
		}
		
		List<WebElement> popUp3 =driver.findElements(By.className("close-btn"));
		//System.out.println(popUp3.size());
		
		if(popUp3.size()>0) {
			popUp3.get(0).click();
		}
		
		Thread.sleep(2000);
		
		WebElement fashion = driver.findElement(By.linkText("Women's Fashion"));
		Actions builder = new Actions(driver);
		builder.moveToElement(fashion).build().perform();//to hover mouse to element
		Thread.sleep(2000);
		
		List<WebElement> subElements = driver.findElements(By.xpath("(//dl[@class='sub-cate-items']/dd)[1]/a"));
		System.out.println(subElements.size());
		
		for(WebElement a :subElements) { 
			System.out.println(a.getText()); 
			}
		// Hover on women fashion
		//size an text of women fashion 10 items

	}

}
