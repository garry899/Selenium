package com.crm.qa.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {

	static WebDriver driver;
	static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("");
			prop.load(ip);
		}
	}
}
