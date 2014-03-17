package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeys {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		File file = new File("src/SendKeys.htm");
		String filepath = "file:///"+file.getAbsolutePath();
		
		//进入页面
		System.out.printf("打开页面%s\n",filepath);
		driver.get(filepath);
		//手动复制并粘贴
//		String text = driver.findElement(By.id("A")).getText();
//		driver.findElement(By.id("A")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("B")).sendKeys(text);
//		Thread.sleep(2000);
//		System.out.println("Blowser will be closed");
//		driver.quit();
		
		//copy a 中信息
		driver.findElement(By.id("A")).sendKeys(Keys.chord(Keys.CONTROL+"a"));
		driver.findElement(By.id("A")).sendKeys(Keys.chord(Keys.CONTROL+"x"));
		Thread.sleep(2000);
		//paste 到 b中
		driver.findElement(By.id("B")).sendKeys(Keys.chord(Keys.CONTROL+"v"));
		Thread.sleep(2000);
		driver.findElement(By.id("A")).sendKeys(Keys.chord("hello helloa"));
		Thread.sleep(2000);
		System.out.println("blowser will be closed");
		driver.quit();
		
	}

}
