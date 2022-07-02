package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

	
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));


		WebElement box1 = driver.findElement(By.id("draggable"));
		WebElement box2 = driver.findElement(By.id("droppable"));
		//System.out.println(box2.getText());

		Actions builder = new Actions(driver);
		builder.dragAndDrop(box1, box2).build().perform();
		//System.out.println(box2.getText());
		
		wait.until(ExpectedConditions.textToBePresentInElement(box2, "Dropped!"));
		
		if(box2.getText().equals("Dropped!")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		
		//verify drag and drop
		
	}

}
