package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) throws InterruptedException{
		  WebDriver driver = new FirefoxDriver();

          File file = new File("src/wait.htm");
          String filePath = "file:///" + file.getAbsolutePath();
          System.out.println("打开页面"+filePath);

          driver.get(filePath);
          Thread.sleep(2000);
          
          driver.findElement(By.id("btn")).click();
          
          //等待下来菜单出现
          (new WebDriverWait(driver,10,2)).until(new ExpectedCondition<Boolean>()
        		  {
        	  		public Boolean apply(WebDriver d){
        	  			return d.findElement(By.className("label")).isDisplayed();
        	  		}
        		  });
          
          Thread.sleep(2000);
          System.out.println("blowser will be closed");
          driver.quit();
          
	}

}
