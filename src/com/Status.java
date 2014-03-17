package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Status {
	 public static void main(String[] args) throws InterruptedException {
		 
		  WebDriver driver = new FirefoxDriver();

	         File file = new File("src/status.htm");
	         String filePath = "file:///" + file.getAbsolutePath();
	         System.out.printf("进入页面： %s \n", filePath);
	         driver.get(filePath);
	         Thread.sleep(1000); 
	         //判断输入框是否可录入信息
	         WebElement textField=driver.findElement(By.name("user"));
	     System.out.println("user "+textField.isEnabled());
	     //判定button是否可选  不太清楚
	     System.out.println("button "+driver.findElement(By.className("btn")).isEnabled());
	     //	不太清楚js，以及为何要隐藏
	     ((JavascriptExecutor)driver).executeScript("$(arguments[0]).hide()", textField);
         System.out.println(textField.isDisplayed());
	     //判断单选按钮是否为选定状态
	     WebElement radio = driver.findElement(By.cssSelector("input[type=radio]"));
	     radio.click();
	     System.out.println("radio "+radio.isSelected());
	     
	     try{
             driver.findElement(By.id("none"));
         } catch(NoSuchElementException e){
             System.out.println("element does not exist");
         }

	     //关闭页面
	     System.out.println("blowser will be closed");
	     Thread.sleep(2000);
	     driver.quit();
	 }
       


}
