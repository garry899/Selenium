package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PropertiesFileTest {

	public static void main(String[] args) throws IOException {

		FileInputStream f = new FileInputStream("/Users/gurindersingh/git/Selenium/SeleniumMyBatch63/src/selenium/prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		WebDriver driver;
		
		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/gurindersingh/Selenium/SeleniumJars/chromedriver");
			driver = new ChromeDriver();
		} else if(browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
			driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.safari.driver", "/Users/gurindersingh/Selenium/SeleniumJars/safaridriver");
			driver = new SafariDriver();
		}

		driver.get("https://www.facebook.com/"); //Open Facebook
		driver.findElement(By.id("email")).sendKeys("sdgsfgdrthdfgdsfahgsdagsdy"); //Type wrong email
		driver.findElement(By.id("pass")).sendKeys("sdgdgsdfhxfgxhtjdfh");//Type wrong pass

	}

}
