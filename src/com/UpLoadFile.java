package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpLoadFile {
	 public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new FirefoxDriver();

         File file = new File("src/uploadfile.htm");
         String filePath = "file:///" + file.getAbsolutePath();
         System.out.println("´ò¿ªÒ³Ãæ"+ filePath);

         driver.get(filePath);
         Thread.sleep(2000);

         driver.findElement(By.cssSelector("input[type=file]")).sendKeys("D:/spring.jpg");

         Thread.sleep(5000);
         System.out.println("browser will be close");
         driver.quit();  
     }
}
