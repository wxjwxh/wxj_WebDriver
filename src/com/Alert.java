package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException{
		  WebDriver driver = new FirefoxDriver();

          File file = new File("src/alert.htm");
          String filePath = "file:///" + file.getAbsolutePath();
          System.out.println("进入页面 "+ filePath);

          driver.get(filePath);
          Thread.sleep(2000);
          //点击链接内容
          driver.findElement(By.id("tooltip")).click();
          System.out.println("弹出窗口");
          //点击确定
          driver.switchTo().alert().accept();
         System.out.println(driver.findElement(By.id("tooltip")).getAttribute("data-original-title"));  
          Thread.sleep(2000);
          
          System.out.println("blowser will be closed");
          driver.quit();
          
	}
}
