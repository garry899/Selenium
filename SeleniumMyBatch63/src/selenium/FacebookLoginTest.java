package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//1.className  - not working
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sdfgdthsjryujdhsdrydr"); //Space in the class Name, and we can not use it directly
		
		//2.cssSelector - learn syntax for CSS
		//driver.findElement(By.cssSelector("")).sendKeys("sdgsdfhtfjreyhsdfh");
		
		//3.id - working (id Attribute)
		//driver.findElement(By.id("email")).sendKeys("sdgdyhsryetsuhdsher");
		
		//4.linkText - only for links
		//driver.findElement(By.linkText(null)) // we can not use in this case
		
		//5.name - working (name attribute)
		//driver.findElement(By.name("email")).sendKeys("sdaagsrheruhdstgwe");
		
		//6.partialLinkText - only for links
		//driver.findElement(By.partialLinkText(null));
		
		//7.tagName - not unique
		//driver.findElement(By.tagName("input")).sendKeys("fsdagsdfyheryerye");
		
		//8.xpath - learn syntax for xpath
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("cfygvuhbjnkm#$");
		//driver.findElement(By.xpath("//*[@data-testid='royal_email']")).sendKeys("fcygvuhbijnok#$");
		driver.findElement(By.xpath("//form[starts-with(@id,'u_0_a_')]/div/div/input")).sendKeys("cfygvuhbjn#$");//use when no attributes in your final tag
		driver.findElement(By.name("pass")).sendKeys("sdgsfgwragsdgsdfgr");
		System.out.println(driver.findElement(By.xpath("//form[starts-with(@id,'u_0_a_')]/div/div/input")).getAttribute("value"));// to print the written value
		
	
		driver.findElement(By.tagName("button")).click();
		
		
		
	}

}
