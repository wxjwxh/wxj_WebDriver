package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {
	public static void main(String[] args) throws InterruptedException{
		
		 WebDriver driver = new FirefoxDriver();

         File file = new File("src/css.htm");
         String filePath = "file:///" + file.getAbsolutePath();
         System.out.printf("now accesss %s \n", filePath);

         driver.get(filePath);
         Thread.sleep(1000);

         WebElement link = driver.findElement(By.id("tooltip"));

         System.out.println("1 "+link.getCssValue("color"));
       
         System.out.println(driver.findElement(By.tagName("h3")).getCssValue("font-size"));
        
         Thread.sleep(1000);
         System.out.println("browser will be close");
         driver.quit();  
     }
	
}


