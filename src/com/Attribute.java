package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute {
	 public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new FirefoxDriver();

         File file = new File("src/attribute.htm");
         String filePath = "file:///" + file.getAbsolutePath();
         System.out.printf("now accesss %s \n", filePath);

         driver.get(filePath);
         Thread.sleep(2000);

         WebElement link = driver.findElement(By.id("tooltip"));
         
         //��ȡtooltip������ �ص�ע��
         System.out.println(link.getAttribute("data-original-title"));
         //��ȡ���ӵ�����
         System.out.println(link.getText());
         
         System.out.println("blowser will be closed");
         Thread.sleep(2000);
         driver.quit();
         
	 }

}
