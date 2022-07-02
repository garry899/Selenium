package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%26ogbl%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> itr = allWindows.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		System.out.println(parentWindow);
		System.out.println(childWindow);
		
		/*
		 * for(String handle : allWindows) { System.out.println(handle); }
		 */
		Thread.sleep(3000);
		driver.switchTo().window(childWindow);//Handle of the window
		System.out.println(driver.getTitle());//Help Page Title);
		driver.close();//close only current window tab
				
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());//Gmail Page title
		driver.quit();//close the browser
	
	}

}
