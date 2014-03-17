package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LevelLocate {

	 public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new FirefoxDriver();

         File file = new File("src/LevelLocate.htm");
         String filePath = "file:///" + file.getAbsolutePath();
         System.out.printf("����ҳ��%s \n", filePath);

         driver.get(filePath);
         Thread.sleep(1000);

         driver.findElement(By.linkText("Link1")).click();
         
         //������⣿����
         (new WebDriverWait(driver,20)).until(new ExpectedCondition<Boolean>(){
        	 public Boolean apply(WebDriver d){
        		 return d.findElement(By.id("dropdown1")).isDisplayed();
        	 }	 
         });
         
         WebElement menu = driver.findElement(By.id("dropdown1")).findElement(By.linkText("Another action"));
        //ģ�����������ȷ��
         (new Actions(driver)).moveToElement(menu).perform();
         Thread.sleep(2000);
         System.out.println("browser will be close");
         driver.quit();  
     }

 

}
