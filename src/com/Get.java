package com;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get {
	
	
	public static void main(String[] args) throws Exception{
		
		String url= "http://www.baidu.com";//一开始此处填写www.baidu.com出错
		System.out.println("open Browser");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get(url);
		System.out.printf("now accesss %s \n", url);
		Thread.sleep(5000);
		System.out.println("Browser will be close");
		driver.quit();
		
	
	}

}
