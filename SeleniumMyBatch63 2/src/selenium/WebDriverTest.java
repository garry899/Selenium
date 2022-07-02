package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		//ClassName objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver(); 
		//parentClassName/InterfaceName objName = new ClassName();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/"); 
		
		driver.findElement(By.id("email")).sendKeys("sdgsfgdrthdfgdsfahgsdagsdy"); 
		driver.findElement(By.id("pass")).sendKeys("sdgdgsdfhxfgxhtjdfh");
		driver.findElement(By.name("login")).click(); 


	}

}
