package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TimeOutSet {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.baidu.com";
		driver.get(url);
		//ҳ����س�ʱʱ������Ϊ5s
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("kw1")).sendKeys("implicitlyWait");
		driver.findElement(By.id("su1")).click();
		//���3s�ڻ���λ�������׳��쳣
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//�첽�ű��ĳ�ʱʱ�����ó�3s
		driver.manage().timeouts().setScriptTimeout(3, TimeUnit.SECONDS);
		System.out.println("blowser will be closed");
		driver.quit();
	}

}
