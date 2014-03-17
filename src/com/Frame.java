package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		
		   WebDriver driver = new FirefoxDriver();

	        File file = new File("src/frame.htm");
	        String filePath = "file:///" + file.getAbsolutePath();
	        System.out.println("打开页面"+ filePath);

	        driver.get(filePath);
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        
	        //先找到f1再找f2
	        driver.switchTo().frame("f1");
	        Thread.sleep(2000);
	        driver.switchTo().frame("f2");
	        Thread.sleep(2000);
	        
	        //在百度的输入框录入信息
	        driver.findElement(By.id("kw1")).sendKeys("frame");
	        driver.findElement(By.id("su1")).click();
	        Thread.sleep(2000);
	        
	        //跳出所以的frame
	        driver.switchTo().defaultContent();
	        
	        //再到f1
	        driver.switchTo().frame("f1");
	        driver.findElement(By.linkText("click")).click();
	        
	        Thread.sleep(2000);
            System.out.println("browser will be close");
            driver.quit();  
	}
     
}
