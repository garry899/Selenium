package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookSignUpTest {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");

		System.setProperty("webdriver.chrome.driver", "/Users/gurindersingh/Selenium/SeleniumJars/chromedriver");
		WebDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("srxdtfcyg#$uvyibhjno");
		//driver.findElement(By.xpath("//div[@class='_6lux'][1]")).sendKeys("dcfevbgr$#"); // doesn't send values in div, only to understand[1] concept

		//driver.findElement(By.xpath("(//div[@class='_6lux'])[1]")).sendKeys("wsredtfyguhi#$");// doesn't send values in div, only to understand[1] concept
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("frbdehuwijnqs");;
	//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("dtfygvubhinj");
	driver.findElement(By.xpath("//input[@placeholder='Password' and @id='pass']")).sendKeys("drtcfyvgbuhn");
		//	driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		//driver.findElement(By.xpath("//button[@data-testid='royal_login_button' and @type='submit']")).click();
		driver.findElement(By.xpath("//button[@data-testid='royal' or @type='submit']")).click();
	}

	
	//Selcet July
	//Selct 20
	//Select 2000
	//Click on radio button
}
