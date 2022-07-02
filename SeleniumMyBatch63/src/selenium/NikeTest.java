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
		
		WebElement men = driver.findElement(By.linkText("Women"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();//to hover mouse to element
		
		List<WebElement> all = driver.findElements(By.xpath("//a[contains(@aria-label,'main-menu, Women, Clothing')]"));
		System.out.println(all.size());
		for(WebElement a :all) { 
			System.out.println(a.getText()); 
			}
		
		
		//hover on men
		//print 2nd column size and text

	}

}
