package com.faiz.baseclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public static WebDriver driver;
	
	public static void brwserlaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\ProjectWorkSpace\\OrangeHRM\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	public static WebElement by(By by) {
		return driver.findElement(by);
	}
	
	public static WebElement findById(String id) {
		return driver.findElement(By.id(id));
	}
	
	public static WebElement findByXpath(String path) {
		return driver.findElement(By.xpath(path));
	}
	
	public static void sendValues(WebElement webElement, String keys) {
		webElement.sendKeys(keys);
	}
	
	public static void click(WebElement webElement) {
		webElement.click();
	}
	
	public static String getText(WebElement webElement) {
		return webElement.getText();
	}
	
	public static String getAttribute(WebElement webElement) {
		return webElement.getAttribute("value");
	}
	
	public static void windowHandle(int page) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windowHandles);
		driver.switchTo().window(li.get(page));
	}
	
	public static void assertNotEqualUrl(String url) {
//		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(30));
		String currentUrl = driver.getCurrentUrl();
//		w.until(ExpectedConditions.urlToBe(currentUrl));
		Assert.assertNotEquals(url, currentUrl);
//		System.out.println(url + +);
	}
	
	public static void assertElementToBeDisappear() {
//		Assert.
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

}

