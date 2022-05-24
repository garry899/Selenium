package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "/Users/gurindersingh/Selenium/SeleniumJars/chromedriver");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");

		driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("easrfd@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("defvewedwfv");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@data-auto-id='login-form-login']")).click();
		Thread.sleep(4000);
		
		String expectedErrMsg = "Incorrect Message";
		String actualErrMsg = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();;
		if(actualErrMsg.equals(actualErrMsg)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
	}

}
