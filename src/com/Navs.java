package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navs {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		File file = new File("src/navs.htm");
		
		String filepath = "file:///"+file.getAbsolutePath();
		System.out.println("打开页面"+filepath);
		driver.get(filepath);
		
		//点击导航条中about 先通过ul在通过li
		
		driver.findElement(By.className("nav")).findElement(By.linkText("About")).click();
		Thread.sleep(5000);
		//关闭页面
		System.out.println("blowser will be closed");
		driver.quit();
		
	}
}
