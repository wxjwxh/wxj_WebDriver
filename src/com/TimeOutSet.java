package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeOutSet {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.baidu.com";
		driver.get(url);
		//页面加载超时时间设置为5s
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("kw1")).sendKeys("implicitlyWait");
		driver.findElement(By.id("su1")).click();
		//如果3s内还定位不到则抛出异常
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//异步脚本的超时时间设置成3s
		driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
		System.out.println("blowser will be closed");
		driver.quit();
	}

}
