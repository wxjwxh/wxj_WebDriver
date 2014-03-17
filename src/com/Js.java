package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Js {
	static JavascriptExecutor  js;
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		js = (JavascriptExecutor)driver;
		File file = new File("src/js.htm");
		String filepath = "file:///"+file.getAbsolutePath();
		//进入页面
		System.out.println("进入页面"+filepath);
		driver.get(filepath);
		//页面最大化
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//在页面上直接执行js 显示tooltip上面的信息
		js.executeScript("$('#tooltip').fadeOut();");
		Thread.sleep(2000);
		//在已经定位的元素上执行js
		WebElement button = driver.findElement(By.className("btn"));
		js.executeScript("$(arguments[0]).fadeOut();", button);
		Thread.sleep(2000);
		
		System.out.println("blowser will be closed");
		driver.quit();
		
		
		
	}

}
