package com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Maximize {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		System.out.println("之前页面");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("关闭页面");
		driver.quit();
		
	}

}
