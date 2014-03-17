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
	        System.out.println("��ҳ��"+ filePath);

	        driver.get(filePath);
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        
	        //���ҵ�f1����f2
	        driver.switchTo().frame("f1");
	        Thread.sleep(2000);
	        driver.switchTo().frame("f2");
	        Thread.sleep(2000);
	        
	        //�ڰٶȵ������¼����Ϣ
	        driver.findElement(By.id("kw1")).sendKeys("frame");
	        driver.findElement(By.id("su1")).click();
	        Thread.sleep(2000);
	        
	        //�������Ե�frame
	        driver.switchTo().defaultContent();
	        
	        //�ٵ�f1
	        driver.switchTo().frame("f1");
	        driver.findElement(By.linkText("click")).click();
	        
	        Thread.sleep(2000);
            System.out.println("browser will be close");
            driver.quit();  
	}
     
}
