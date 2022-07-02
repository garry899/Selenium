package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		

		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		List<WebElement> element = driver.findElements(By.id("draggable"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		System.out.println("-------------");
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame("demo-frame");//This option only works for id or name
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
	
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		element = driver.findElements(By.id("draggable"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		System.out.println("----------------------------------------------------------------Switching to main page");
		
		driver.switchTo().defaultContent();//take you to the main page
		
		sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		element = driver.findElements(By.id("draggable"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
	}

}
