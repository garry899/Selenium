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

public class MultipleBrowserTest1 {

	public static void main(String[] args) throws IOException {
		String browser = "Chrome";//Chrome,Safari
		
		FileInputStream f = new FileInputStream("/Users/gurindersingh/git/Selenium/SeleniumMyBatch63/src/selenium/prop.properties");

		Properties prop = new Properties();
		prop.load(f);
		if(browser.equals("Firefox")) {

			System.getProperty("Firefox");
		}else if(browser.equals("Chrome")) {
			System.getProperty("Chrome");
		}
		
		/*
		 * driver.get("https://www.facebook.com/"); //Open Facebook
		 * driver.findElement(By.id("email")).sendKeys("sdgsfgdrthdfgdsfahgsdagsdy");
		 * //Type wrong email
		 * driver.findElement(By.id("pass")).sendKeys("sdgdgsdfhxfgxhtjdfh");//Type
		 * wrong pass driver.findElement(By.name("login")).click(); //click on login
		 * button
		 */
	}

}