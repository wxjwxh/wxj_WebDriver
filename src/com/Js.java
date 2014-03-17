package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Js {
	static JavascriptExecutor  js;
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		js = (JavascriptExecutor)driver;
		File file = new File("src/js.htm");
		String filepath = "file:///"+file.getAbsolutePath();
		//����ҳ��
		System.out.println("����ҳ��"+filepath);
		driver.get(filepath);
		//ҳ�����
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//��ҳ����ֱ��ִ��js ��ʾtooltip�������Ϣ
		js.executeScript("$('#tooltip').fadeOut();");
		Thread.sleep(2000);
		//���Ѿ���λ��Ԫ����ִ��js
		WebElement button = driver.findElement(By.className("btn"));
		js.executeScript("$(arguments[0]).fadeOut();", button);
		Thread.sleep(2000);
		
		System.out.println("blowser will be closed");
		driver.quit();
		
		
		
	}

}
