package org.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


	public class BaseClass {
		 
		public static WebDriver driver;
		
		public static void chromeBroswer() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		public static void edgeBrowser() {
	               WebDriverManager.edgedriver().setup();
	               driver=new EdgeDriver();
	               
		}
		
		public static void urlLaunch(String url) {
	          driver.get(url);
		}
		
		public static String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;

		}
		public static void quit() {
	               driver.quit();
		}
		public static void sendkeys(WebElement element,String value) {
			element.sendKeys(value);

		}
		
		public static void click(WebElement element) {
			element.click();
	               
		}
		
		public static String getAttribute(WebElement element) {
	         return element.getAttribute("value");     
		}
		
		public static String getText(WebElement element) {
			return element.getText();  
		}
		

	}


