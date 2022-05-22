package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		List<WebElement> nike = driver.findElements(By.xpath("(//div[@class='pre-menu-column pt4-sm ta-sm-l va-sm-t ncss-col-sm-2'])[7]/a"));
		System.out.println(nike.size());
		
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();//to hover mouse to element
		
		for(WebElement a :nike) { 
			System.out.println(a.getText()); 
			}
		
		
		//hover on men
		//print 2nd column size and text

	}

}
