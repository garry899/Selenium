package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allList = driver.findElements(By.xpath("//select[@id='gh-cat']//option"));
		
		
		System.out.println(allList.size());
		for(int i=0;i<allList.size();i++) {
			if(allList.get(i).isSelected()==true) {
			System.out.println(allList.get(i).getText()+"-----------"+allList.get(i).isSelected());
		}
	}
		
		WebElement dropDownBox = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropDownBox);
		
		s.selectByIndex(2); //Select art
		Thread.sleep(3000);
		
		s.selectByValue("2984");//Select baby

		Thread.sleep(3000);
		
		s.selectByVisibleText("Books");
		
	System.out.println("--------------");
	
	for(int i=0;i<allList.size();i++) {
		if(allList.get(i).isSelected()==true) {
			System.out.println(allList.get(i).getText()+"-----------"+allList.get(i).isSelected());
		}
}
	}
}