package com;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modal {
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		
		File file = new File("src/modal.htm");
		String filepath = "file:///"+file.getAbsolutePath();
		//����ҳ��
		System.out.println("��ҳ��"+filepath);
		driver.get(filepath);
		
		//���modal
		driver.findElement(By.id("show_modal")).click();
		
		new WebDriverWait(driver,10).until(new ExpectedCondition <Boolean>(){
			public Boolean apply(WebDriver dr){
			
				return dr.findElement(By.id("myModal")).isDisplayed();
				
			}
		});
		
		WebElement link = driver.findElement(By.id("myModal")).findElement(By.id("click"));
		
		
		((JavascriptExecutor)driver).executeScript("$(arguments[0]).click()", link);
		
		System.out.println("blowser will be closed");
		driver.quit();
				
	}
			
}
