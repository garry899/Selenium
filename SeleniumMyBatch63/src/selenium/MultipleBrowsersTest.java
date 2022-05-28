package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) {
		
		String browser = "Chrome";//Chrome,Safari
		//read from excel or property file
		WebDriver driver;
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/gurindersingh/Selenium/SeleniumJars/chromedriver");
			//ClassName objName = new ClassName();
			driver = new ChromeDriver(); //Open Firefox	
		}else {
			System.setProperty("webdriver.safari.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
			driver = new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/"); //Open Facebook
		driver.findElement(By.id("email")).sendKeys("sdgsfgdrthdfgdsfahgsdagsdy"); //Type wrong email
		driver.findElement(By.id("pass")).sendKeys("sdgdgsdfhxfgxhtjdfh");//Type wrong pass
		driver.findElement(By.name("login")).click(); //click on login button

	}

}
