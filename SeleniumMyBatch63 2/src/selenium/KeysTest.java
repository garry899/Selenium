package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeysTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "/Users/gurindersingh/Selenium/SeleniumJars/geckodriver");
		FirefoxDriver driver = new FirefoxDriver(); 	
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=4PXAKmuo_Zk&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiNFBYQUttdW9fWmsiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1MjAyMTk4NywiaWF0IjoxNjUyMDIwNzg3LCJqdGkiOiI1MTg2ODQ0Ni1jN2NhLTRjZGUtYTU3Mi0wZGE1MWZiNDM5MjkiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.SJ1krxPIdwqCZn9-b7oh3ASNbunBia9S6rMl3G12VFjCc7oty7g_-EAJt6JyINpYo3JivEbW5hiKHgAphcq-LOc6vAW62772qk1NwuYUkYQgBXbGjvDvCYqbfMxjl1DIq5xm5JiYd_GDNtyrN5KfINwA6Fld4n7Q3vAEXfTSj46MIAJVJ_xEDgFj_QE9HPJp0Lgmh7pcGvTr3xHWEKcH-DBAC6bJMS79nl_efZLEiEWvajZxZpAgDYgtpJFiz_N3DqwZbvPQM2Uuu9BxG2ZrNoStYl36wcWcKl1qN2mKoBLojg08qSQ11N0FCkGXPQuwLIM6WR_6be85y0spwmP7kQ&preferred_environment=");

		driver.findElement(By.id("usernameInput-input")).sendKeys("sdgsdfhdfherjsgfdsg@#$");
		driver.findElement(By.name("password")).sendKeys("dfgsdhgsrhetjhr");
		driver.findElement(By.name("password")).sendKeys(Keys.RETURN);
		//driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000); //stop execution for 3 seconds
		
		String expctedMessage = "Please enter a username or card number without special characters.";
		String actualMessage = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualMessage);
		
		if(expctedMessage.equals(actualMessage)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}

	}

}
