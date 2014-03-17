package com;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleAndUrl {

	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		String url = "http://www.baidu.com";
		driver.get(url);
		Thread.sleep(2000);
		System.out.printf(" title of current page: %s\n",driver.getTitle());
		System.out.printf("url of current page:%s\n",driver.getCurrentUrl());
		System.out.println("browser will be close");
		assertEquals("百度一下，你就知道", driver.getTitle());
		driver.quit();
		
	}
}
