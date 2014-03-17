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
	         System.out.printf("����ҳ�棺 %s \n", filePath);
	         driver.get(filePath);
	         Thread.sleep(1000); 
	         //�ж�������Ƿ��¼����Ϣ
	         WebElement textField=driver.findElement(By.name("user"));
	     System.out.println("user "+textField.isEnabled());
	     //�ж�button�Ƿ��ѡ  ��̫���
	     System.out.println("button "+driver.findElement(By.className("btn")).isEnabled());
	     //	��̫���js���Լ�Ϊ��Ҫ����
	     ((JavascriptExecutor)driver).executeScript("$(arguments[0]).hide()", textField);
         System.out.println(textField.isDisplayed());
	     //�жϵ�ѡ��ť�Ƿ�Ϊѡ��״̬
	     WebElement radio = driver.findElement(By.cssSelector("input[type=radio]"));
	     radio.click();
	     System.out.println("radio "+radio.isSelected());
	     
	     try{
             driver.findElement(By.id("none"));
         } catch(NoSuchElementException e){
             System.out.println("element does not exist");
         }

	     //�ر�ҳ��
	     System.out.println("blowser will be closed");
	     Thread.sleep(2000);
	     driver.quit();
	 }
       


}
