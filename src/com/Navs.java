package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navs {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		File file = new File("src/navs.htm");
		
		String filepath = "file:///"+file.getAbsolutePath();
		System.out.println("��ҳ��"+filepath);
		driver.get(filepath);
		
		//�����������about ��ͨ��ul��ͨ��li
		
		driver.findElement(By.className("nav")).findElement(By.linkText("About")).click();
		Thread.sleep(5000);
		//�ر�ҳ��
		System.out.println("blowser will be closed");
		driver.quit();
		
	}
}
